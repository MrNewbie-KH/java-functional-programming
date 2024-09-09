1. Assigning functions to variables (JS)
```js
//Assign function
   const add = (a, b) => a + b;
   //Use function
   console.log(add(3, 4));

```   
2. Function as arguments (JS)

```js

//Receive function as argument
function register(name, callback) {
// some logic here
callback(name + '@domain.com');
}
function sendWelcomeMail(mail) {
console.log('MAILING ' + mail);
}
//Send function as argument
register('hany', sendWelcomeMail);

```
