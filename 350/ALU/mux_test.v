`include "mux.v"



module test_mux;
    reg[7:0][7:0] a;
    reg[2:0] sel;
    wire[7:0] out;

    eightOneMux MUX(sel, a, out);

    initial
        begin
            $monitor($time,,"sel=%b, out=%b",sel,out);
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b000;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b001;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b010;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b011;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b100;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b101;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b110;
            #10 a[0]=8'b011_11011; a[1]=8'b1000_0101; a[2]=8'b0101_1011; a[3]=8'b1111_0110; a[4]=8'b0111_0010; a[5]=8'b0001_1110; a[6]=8'b1010_0010; a[7]=8'b1001_1001; sel=3'b111;
            #10 $finish;
        end
endmodule
