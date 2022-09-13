<template>
  <button
    v-bind="$attrs"
    class="btn"
  >
    <i v-if="icon" :class="`fa-solid ${icon}`"/>
    <span v-if="text">{{text}}</span>
    <slot></slot> <!--Default-->
  </button>
</template>

<script>
export default {
  props: {
    icon: String,
    text: String,
    stackedButton: {
      type: Boolean,
      default: false
    }
  }
}
</script>

<style scoped>
  .btn {
    border-radius: 10px;
    padding: 10px;
    border: none;
    text-align: center;
    display: flex;
    flex-direction: column;
  }
  .btn:hover {
    cursor: pointer;
  }
</style>