public class Strings {
    public static void main(String[] args) {
        String s1 = "lala";
        String s3 = "lala";
        String s2 = new String("lala");// ссылочный тип

        s3 += " lala";// конкатинация - сложение строк

        System.out.println(s1 == s2);//сравниваются ссылки, тк new String -  'nj d rext'
        System.out.println(s1.equals(s2));//смотрится посимвольно
        System.out.println(s1 == s3);// Не как в массивах: там сравниваются через == ссылки, тут - значения
        System.out.println("1235".charAt(2));
        System.out.println("664568984658".replace("6", "8"));
    }


    // equals вернет false у равных элементов сложных классов, если они лежат в динамической памяти
}
