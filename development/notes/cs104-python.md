> 학습 원본 보존 문서.
> 출처: [cs104](https://app.notion.com/p/010ddb1a6377833988a1815026625b5e)

### 배열을 사용하는 이유
- **효율성**: 배열은 요소의 무작위 액세스를 가능하게 한다. 즉, 배열 안 위치와 관계없이 모든 요소에 액세스하는 데 같은 시간이 소요된다.
- **편의성**: 단일 식별자로 같은 유형의 변수 모음을 처리할 수 있다.
### **파이썬에서 배열 만들기**
파이썬은 배열을 기본적으로 지원하지는 않지만 유사하게 사용할 수 있는 리스트 객체를 지원한다. 그러나 숫자 배열의 경우, 파이썬은 특정 유형의 요소로 배열을 만드는 데 사용할 수 있는 특수 배열 모듈을 제공한다. 
### 파이썬 리스트를 배열로 사용하기
```python
# Creating a list
my_list = [10, 20, 30, 40, 50]
print(my_list)
```
### 배열 모듈 사용하기
```python
from array import array

# Creating an array of integer type
my_array = array('i', [10, 20, 30, 40, 50])
print(my_array)
```
### **배열 요소에 액세스하기**
배열의 요소는 인덱스를 사용하여 액세스할 수 있다. 배열의 인덱스는 0부터 시작하므로 배열의 첫 번째 요소는 `0`로, 두 번째 요소는 `1`로 액세스하는 방식이다.
```python
# Accessing the first element
print(my_list[0])  # Output: 10
print(my_array[0])  # Output: 10
```
### **배열 요소 수정하기**
배열 요소는 인덱스를 사용하여 액세스한 다음 새 값으로 수정할 수 있다.
```python
# Modifying the first element
my_list[0] = 100
my_array[0] = 100

print(my_list)  # Output: [100, 20, 30, 40, 50]
print(my_array)  # Output: array('i', [100, 20, 30, 40, 50])
```
### **기본 연산**
- **길이**: **`len(my_list)`** 또는 **`len(my_array)`**
- **요소 추가**: 리스트의 경우, **`my_list.append(60)`****. **배열의 경우, **`my_array.append(60)`**
- **요소 제거**: 리스트의 경우, **`my_list.remove(30)`**. 배열의 경우, **`my_array.remove(30)`**
