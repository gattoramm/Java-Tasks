package OOP.TypeVarMembers;

class C {
    public      void mCPublic() {}
    protected   void mCProtected() {}
                void mCPackage() {}
    private     void mCPrivate() {}
}

interface I {
    void mI();
}

class CT extends C implements I {
    public void mI() {}
}

class Test {
    <T extends C & I> void test(T t) {
        t.mI();
        t.mCPublic();
        t.mCProtected();
        t.mCPackage();
        //t.mCPrivate();
    }
}
