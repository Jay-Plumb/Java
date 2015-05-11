public class main {
        public static void main(String args[]) {
                Stack<String> s;
                s = new Stack<String>();

            while(!StdIn.isEmpty()) {
                        String item = StdIn.readString();
                        //StdOut.println(item);
                        // Ignore input with "-"
                        if(!item.equals("-")) {
                                s.push(item);
                        }else if(!s.isEmpty()){
                                StdOut.print(s.pop() + " ");
                        }

                }
                StdOut.println("(" + s.size() + " left on stack )");
        }
}