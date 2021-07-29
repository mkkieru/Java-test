public class triangle {
    public String type(int a,int b,int c){
        String triangleType = "";
        if (a==b && b==c){
            triangleType = "Equilateral";
            return triangleType;
        }else if ((a+b)<c || (a+c)<b || (b+c)<a){
            triangleType = "That is not a triangle boss !";

        }

        else if (a == b || a == c || b == c){
            triangleType = "Isosceles";
        }else if (a != b && b != c){
            triangleType = "Scalene";
        }

        return triangleType;

    }
}
