package problem5;

public @interface TestAnno {
    String name();

    int age() default 2;

    int[] ages();
}
