# AndroidStudio_cats
### Recyclerview를 이용하여 Main activity구성하기

Listview에서는 모든 데이터 대한 View를 만들고, View가 사라졌다가 나타날 때마다 리소스를 불러와야하기 때문에 앱이 느려지거나 충돌할 가능성이 있다. 

예를 들어 화면을 아래로 스크롤 했다가 다시 위로 올릴때마다 리소를 불러오게 되는 상황. 이와 같은 경우 많은 메모리와 저장 공간을 사용하므로 대용량 데이터 이용하면 충돌가능성 존재

RecyclerView는 ListView의 단점을 보완하기 위해 만들어졌다.

1. ViewHolder를 필수적 사용
2. LayoutManager를 설정

=> 앱에서 불필요하게 메모리를 사용하는 일은 줄어든다.
