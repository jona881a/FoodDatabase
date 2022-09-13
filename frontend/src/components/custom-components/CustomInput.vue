<template>
  <input
      :value="modelValue"
      :type="type"
      :placeholder="placeholder"
      @input="$emit('update:modelValue',$event.target.value)"
      class="input-style"
  >
</template>

<script>
export default {
  props: {
    modelValue: String,
    type: String,
    placeholder: String
  },
  emits: ['update:modelValue']
}
</script>

<style scoped>
  .input-style {
    padding: 10px 15px;
    margin: 10px;
    border-radius: 20px;
    border: 1px solid;
    width: 200px;
  }
</style>