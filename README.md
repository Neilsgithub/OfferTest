#剑指Offer笔试题

*题目来源：*[牛客网](http://www.nowcoder.com/ta/coding-interviews?page=1)

###题目一：二维数组中的查找###
*描述：*  
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。  

*解题思路：*  
将target与二维数组array第一行最后一个数做比较,如果target大于该行数,则不考虑第一行,相反不考虑最后一列,相等返回true；  
