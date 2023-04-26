// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
// Потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
// Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт,
// на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1.
// Гарантируется что любой продукт состоит из 1 слова. Название продуктов написаны строчными буквами.
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные:
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание.
// ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко

// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

package sem2.DZ.allergia;

public class allergia {
    public static void main(String[] args) {
        //int n = 2;
        String s1 = "Recipe 1. Peanut 100g, ice cream 200g. Take a peanut and grind it. Sprinkle crushed peanuts over ice cream.";
        String s2 = "Recipe 2. Strawberry 100g, condensed milk 3kg. Mix, eat) Enjoy life.";
        //int m = 3;
        // String sx1 = "peanut - sausage";
        // String sx2 = "strawberry - cherry";
        // String sx3 = "condensed milk - milk";

        String repl_s1 = s1.replace("Peanut", "Sausage");
        String repl_s11 = repl_s1.replace("peanut", "sausage");

        String repl_s2 = s2.replace("Strawberry", "cherry");
        String repl_s22 = repl_s2.replace("condensed milk", "milk");
        System.out.println("\n" + repl_s11 + "\n"+ repl_s22 + "\n");
    }
}

