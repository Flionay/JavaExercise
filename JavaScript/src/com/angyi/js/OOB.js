var preson={
    name:'name',
    age:12,
    run:function (){
        console.log(this.name+"run.....");
    }
}

var xiaoming={
    name:"xiaoming"
}

xiaoming.__proto__ = person;