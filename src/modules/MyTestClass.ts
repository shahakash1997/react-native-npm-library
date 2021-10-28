class MyTestClass {
  name: string | undefined;
  constructor() {
    this.name = 'Akash Shah';
  }
  public testFun() {
    console.log('test fun called');
  }

  public addNum(a: number, b: number) {
    this.testFun();
    return a + b;
  }
}
export default MyTestClass;
