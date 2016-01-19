p u b l i c class OOPStudent {
 p r i v a t e i n t score ;
 p r i v a t e St r i n g name ;
 p u b l i c void set_score ( i n t new_score ) { score = new_score ; }
 p u b l i c St r i n g get_name ( ) { r e t u r n name ; }
 p u b l i c double get_adjusted ( ) { r e t u r n (60 + score  0 . 4 ) ; }

p u b l i c class OOPStudentDemo{
p u b l i c s t a t i c void main ( St r i n g [ ] arg ) {
OOPStudent Char l ieL = new OOPStudent ( ) ;
Char l ieL . set_score ( 8 0 ) ;
System. out . p r i n t l n ( Char l ieL . get_adjusted ( ) ) ;
System. out . p r i n t l n ( Char l ieL . get_name ( ) ) ;
}
}
