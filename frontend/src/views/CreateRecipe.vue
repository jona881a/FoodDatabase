<template>
  <div class="container borders">
    <div class="form-group">
      <h1>{{recipe.title}}</h1>
    </div>
    <div class="form-row">
      <p>Image here</p>
    </div>
    <div class="form-row">
      <input
          v-model="recipe.reference"
          :placeholder="'Hvorfra opskriften blev hentet fra (kan også være med link)'"
      />
    </div>
    <div class="form-row">
      <input
          v-model="recipe.portions"
          :placeholder="'Hvor mange portioner er opskriften til?'"
      />
    </div>
    <div class="form-row">
      <div class="form-group">
        <button>
          Tilføj ingrediens
        </button>
      </div>
      <div class="form-group">
        <button>
          Tilføj fremgangsmåde skridt
        </button>
      </div>
    </div>
    <custom-tool-bar
        class="custom-toolbar-styling"
        use-form-row
    >
      <custom-button icon="fa-heading fa-xl">
        <span>Overskrift</span>
      </custom-button>
      <custom-button icon="fa-upload">
        <span>Upload billede</span>
      </custom-button>
    </custom-tool-bar>
  </div>
</template>

<script>
//import {recipeService} from "@/service/recipe";
import customInput from "@/components/custom-components/CustomInput";
import CustomToolBar from "@/components/custom-components/CustomToolBar";
import CustomButton from "@/components/custom-components/CustomButton";

export default {
  components: {
    CustomButton,
    customInput,
    CustomToolBar
  },
  props: {},
  data() {
    return {
      recipe: {
        id: null,
        title: null,
        imageUrl: null,
        reference: null,
        portions: null,
        ingredients: null,
        steps: null
      }
    }
  },
  computed: {

  },
  methods: {

  }
}
</script>
<style scoped>
  .custom-toolbar-styling{
    justify-content: space-between;
    font-size: 0.6rem;
  }
</style>