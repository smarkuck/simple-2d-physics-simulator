public class Matrix2 {

    public double[][] elements = new double[2][2];

    //-------------------------------------------------------------------------------

    public Matrix2()
    {
        elements[0][0] = elements[0][1] = elements[1][0] = elements[1][1] = 0;
    }

    //-------------------------------------------------------------------------------

    public Matrix2(double Radians) {
        double Cos = (double) Math.cos(Radians);
        double Sin = (double) Math.sin(Radians);

        elements[0][0] = Cos; elements[0][1] = -Sin;
        elements[1][0] = Sin; elements[1][1] =  Cos;
    }

    //-------------------------------------------------------------------------------

    public Vector2 multiply(Vector2 a)
    {
        return new Vector2(this.elements[0][0]*a.x + this.elements[0][1]*a.y,
                this.elements[1][0]*a.x + this.elements[1][1]*a.y);
    }
}
