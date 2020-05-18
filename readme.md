## How to use ?

### Json은 다음 처럼 구성 되있으며, name에 키 정보를 클라이언트에서 직접 정의하고 관련정보를 받아 출력

```
{
	"name1": {
		"use": false,
		"ads": [
			{
				"image": "http://~",
				"guide": "http://~"
			}
		],
		"ratio": 0.1
	},
	"name2": {
		"use": false,
		"ads": [
			{
				"image": "http://~",
				"guide": "http://~"
			}
		],
		"ratio": 0.1
	}
}
```

##### Json 형식 설명
 - use(boolean) : 사용 유무
 - ads(Ad) : name으로 response받았을때 나오게 되는 광고 모음(1/n) 각각 확률로 출력
   - image : 이미지 URL
   - guide : 터치시 진입하게되는 URL
 - ratio(float) : 0~1값, 해당 확률로 ads의 광고중 하나가 출력되게 됨

### Model 예제 (AdModel.kt)
```
	data class AdResponse(
		val name1: Ad,
		val name2: Ad
	)

	data class Ad(
		val use: Boolean,
		val ads: List<AdPage>,
		val ratio: Float
	)

	data class AdPage(
		val image: String,
		val guide: String
	)
```