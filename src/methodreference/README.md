Sometimes you'll be writing Lambda Expressions that are just calls to specific methods defined somewhere else.
Like:<br/>
`Consumer<String> printer = s -> System.out.println(s);`<br/>
This lambda expression is a reference to the println() method defined on System.out object.
This is where "Method Reference" syntax comes in.

Sometimes Lambda Expression is just a reference to existing method. In such case, we write Method Reference.
Like:<br/>
`Consumer<String> printer = System.out::println;`

##### 4 Categories of Method Reference:
* Static MR : RefType::staticMethod
* Bound MR
* Unbound MR
* Constructor MR
