let loop = (val,test,update,body) => {
	while ( test(val) == true ) {
		body(val);
		val = update(val);
	}
};


loop( 0, (a) => { return  a < 10; }  ,
				(a) => {  return a + 1; },
				(a) => { console.log(a); }
	);

