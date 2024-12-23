package test1219;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101"))
class test1220{
    public static void main(String[] args) {
        Class<test1220> cls = test1220.class;
        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println(anno.testedBy());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    String testedBy();
    DateTime testDate();
}
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
}