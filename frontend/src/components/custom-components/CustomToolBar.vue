<template>
  <div class="container-toolbar">
    <div>
      <slot name="slide-up"></slot>
    </div>
    <div v-bind="$attrs" :class="useFormRow ? 'form-row' : ''">
      <slot></slot>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    modelValue: String,
    useFormRow: {
      type: Boolean,
      default: false
    }
  }
}
</script>

<style scoped>
  .container-toolbar {
    position: fixed;
    bottom: 0;
    z-index: 9998;
    left: 50%;
    transform: translateX(-50%);
    background-color: grey;
    max-width: 100%;
    min-width: 500px;
    border-radius: 10px;
    border: 2px darkred;
    padding: 10px;
  }
</style>