import axios from 'axios';

export const recipeService = {
    getAllRecipes() {
        return axios.get(`/recipe`);
    },

    getRecipe(recipeId) {
        return axios.get(`/recipe/${recipeId}`);
    },

    postRecipe(recipe) {
        return axios.post(`/recipe`, {recipe});
    }
}