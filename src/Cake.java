class Cake {
    public static void main(String[] args){
        Pie x = new Pie();
        x.f();
    }
}
/*
Pie 和  f() 享有包访问权限，Cake.java 能访问它们的原因是因为它们处于相同的目录并且没有给自己设定
包名称。Java将这样的文件自动看作是隶属该目录的默认包之中，于是它们为该目录中所有其他的文件都提供了包访问权限
 */
