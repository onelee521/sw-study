<template>
    <button @click="emit('toggle')">다크 모드</button>
</template>

<script setup>
    import {defineEmits} from 'vue';

    /* 
        부모로 부터 물려 받은 toggle이라는 이름의 이벤트를 호출할 수 있는 함수 반환 받기 
        (defineEmits를 활용하며 배열로 이벤트 이름 작성) 
    */
    const emit = defineEmits(['toggle']);

</script>