package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    /* 설명.
     *  @Qualifier를 통해 원하는 빈 이름(id)으로 하나의 빈을 주입 받을 수 있다.
     *  (@Primary 보다 우선순위가 높다.)
    * */
//    @Autowired
//    @Qualifier("squirtle")
//    @Qualifier("Squirtle")        // 오류가 남, 클래스의 이름이 아니라 빈네임을 사용
                                    // @Component를 했을 때 이름을 따로 지정하지 않으면 클래스 이름에 첫글자를 소문자로 바꿔 사용
    private Pokemon pokemon;

    /* 설명. 생성자 주입을 이용한 Qualifier */
    @Autowired
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
