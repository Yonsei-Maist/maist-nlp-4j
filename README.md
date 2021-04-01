# maist-nlp-4j

The core of nlp-4j for Yonsei MAIST

## Environment
```
jdk 1.8 ~
maven3 ~
```

## Install
in your pom.xml file
```
<repositories>
		<repository>
			  <id>maven-public</id>
        <url>http://maist.yonsei.ac.kr:8888/repository/maven-public/</url>
			  <releases>
				    <enabled>true</enabled>
			  </releases>
		</repository>
</repositories>
<dependencies>
		<dependency>
			  <groupId>kr.ac.yonsei.maist</groupId>
			  <artifactId>maist-nlp</artifactId>
			  <version>{version}</version>
		</dependency>
</dependencies>
```

## Usage
```
StringMatcher matcher = new StringMatcher();

String src = "음성 인식을 비교하기 위한 실제 문자열"; // Original String
String compare = "음성 인식은 비고하기 의한 실제 문자얼"; // Some String that user records

Similarity sim = matcher.compare(src, compare);

System.out.println(sim.toString());
// Similarity{sim=0.75, matchList=[음, 성, 인, 식, 비, 하, 기, 한, 실, 제, 문, 자], mismatchSrcList=[을, 교, 위, 열], mismatchCompareList=[은, 고, 의]}
```
## Author
Chanwoo Gwon, Yonsei Univ. Researcher since 2020.05~

## Maintainer
Chanwoo Gwon, arknell@yonsei.ac.kr (2021.04 ~)
