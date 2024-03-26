<template>
    <h3>전달 받은 props: {{ props.message }}</h3>
</template>

<script setup>
    import { defineProps } from 'vue';

    /* defineProps */
    const props = defineProps({
        message: String
    })
</script>

<style scoped>

</style>