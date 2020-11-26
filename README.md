# Data-Structure
数据结构和算法学习

Java模板

CodeFileName:

```
P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})
```

CodeTemplate:

```
${question.content}

package leetcode.editor.cn;
//Java：${question.title}
public class P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args) {
        Solution solution = new P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
        // TO TEST
    }
    ${question.code}
}
```

