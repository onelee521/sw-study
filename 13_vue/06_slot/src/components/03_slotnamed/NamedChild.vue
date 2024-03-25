<template>
    <slot name="name"></slot>
    <slot name="founder"></slot>
    <slot name="img"></slot>
</template>

<script setup>

</script>

<style scoped>
    .container {
        display: flex;
        flex-direction: column;
        align-items: center;
        border: 1px solid black;
    }
    img {
        width: 200px;
        height: 200px;
    }
</style>