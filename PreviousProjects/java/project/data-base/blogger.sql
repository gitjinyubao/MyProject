/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : blogger

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:51:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article_tbl
-- ----------------------------
DROP TABLE IF EXISTS `article_tbl`;
CREATE TABLE `article_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `content` text NOT NULL,
  `user_username` varchar(16) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `replynumber` int(11) DEFAULT NULL,
  `kind_name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_username` (`user_username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_tbl
-- ----------------------------
INSERT INTO `article_tbl` VALUES ('54', '生活小常识', '<div>\r\n<p><span style=\"font-size:medium\">1、饮水机加柠檬去污渍：家里的茶壶。饮水机用久了，里面有一层白白后后的渣，这时不彷到市场买一颗柠檬，去籽外，切半放进饮水机或茶壶内煮个二或三小时，你会发现里面的渣变少了，多是几次，你会有满意的效果喔！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　2、洋葱煮水去焦痕：若将铝制锅烧焦了，可在锅中放个洋葱和少许水加以煮沸，不久后所有的烧焦物都会浮起来！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　3、茶水漱口好处多：茶叶可预防流感；还可预防牙龈出血；适度茶水，更可防治牙周炎！经常用茶水漱口，包你口腔健康哦！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　4、【生活中的食物让你远离疾病痛苦】1、呕吐：吃蕃茄；2、口臭：多饮水；3、感冒：吃大蒜；4、高血压：喝橘子汁；5、脱发：吃红枣、牛排；6、牙出血：吃猕猴桃；7、打嗝：吃白糖。送给关心的人！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　5、莲子美容羹：莲子30克，薏仁米50克，桂圆肉10克，蜂蜜适量，各种材料同煮至烂熟后加蜂蜜调味，经常食用有消除皱纹，白嫩肌肤的作用，祝你越来越年轻！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　6、清水加白醋为花朵延寿：炎炎夏日，鲜花买回家后容易枯萎，不彷清水中加几滴白醋或漂白水，花枝底部再修剪一下，即可使花朵延年益寿喔！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　7、【八种应对酒后不适的解酒方法】1、蜂蜜水：酒后头痛；2、西红柿汁：酒后头晕；3、新鲜葡萄：酒后反胃、恶心；4、西瓜汁：酒后全身发热；5、柚子：酒后口气；6、芹菜汁：酒后胃肠不适、颜面发红；7、酸奶：酒后烦躁；8、香蕉：酒后心悸、胸闷。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　8、吹风机轻松去标签：买礼盒送人时，价钱卷标很难撕掉，用手抠会抠的黑黑脏脏的反而更难看，如果用吹风机吹热一下再撕，会很轻松的撕下来，不留一点痕迹！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　9、苹果，性味甘凉，具有补脾气、养胃阴、生津解渴、润肺悦心的功效。工作紧张之余闻闻苹果的清香，可提神醒脑，对缓解紧张的情绪有很好的帮助哦。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　10、丝袜冰过再穿更耐久：妇女新买回的丝袜，先不要拆封，直接放入冰箱中冷冻一两天，再取出放置一天后穿用，这样可以增加丝袜的韧度，不至于很快就发生抽丝或破裂的现象，不必花费太多的金钱再购买丝袜上！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　11、【&ldquo;二八法则&rdquo;让疾病绕行】1、主食二分细八分粗：粗细结合，更好吸收蛋白质和钙、铁等矿物质；2、穿衣二分寒八分暖：适当受点冻能促进血液循环；3、心情二分重八分轻：用这种态度看待事物，会变得更轻松快乐。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　12、传真纸当擀面棍：传真纸用完后的纸制棒子，比保鲜膜的棒子细一些，可以拿来当杆面棍，洗净之后，要杆面时，外面包一层保鲜膜用过以后，再将保鲜膜撕掉，清洁又方便！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　13、【最适合陪您过冬的美食】鲈鱼补蛋白，健脾补肾止咳嗽；狗肉吃了阳气旺；黑木耳黑豆来联手，补血润肠功劳大；还有香菇很重要，降血脂它最拿手。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　14、睡觉前伸个懒腰吧，一个缓慢的、舒适的懒腰对于即将休息的人来说是再好不过了，因为它松散可以帮助你放松紧张的神经，助眠安神。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　15、吹风机有助清除脸部污垢：很都人不知吹风机除吹干头发外，仍有许多妙用？如：家庭摆饰用的人造花，一段时间后布满灰尘，又不得用清水清洗可用吹风机小心吹拂，即可轻松完成！如：洗完澡，雾气充满浴室，镜面势必模糊，若要吹整头发时，可顺势举起吹风机除雾！如：冬天骑机车冻麻的耳朵。手。脚，可赶紧用吹风机的热风解除痛苦！如：洗脸时，拿起吹风机，远远的对脸部稍微吹拂可使毛细孔张开，清洁更加彻底！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　16、牙膏清洗冰箱电饭锅：如果家里的冰箱和电饭锅是白色的，日子久后若有些变黄，在清洗时不彷试试挤些牙膏轻轻擦洗会让你有意想不到的洁白光亮&hellip;</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　17、中药食材滋润你的心：紫苏，叶能发表、散风寒，专治鼻塞咳嗽；梗能消除胸腹胀满，有安胎的作用。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　18、春雨绵绵，乍暖还寒。食疗保健，确保周全。多食蜂蜜少食肉，佳品当数醋姜蒜。合理饮食疗效妙，预防春寒不感冒。</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　19、没有经泡水过的新瓷制花盆用来种花，花盆会把土里的水分吸干，造成花草枯死！新花盆在使用前应该放在冷水中浸泡二十分钟，再种上花草便不会枯死！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　20、洗苹果小常识：将苹果湿润后，在表面撒点盐，然后双手握着苹果来回轻轻地搓，苹果表面赃物将很快清除，然后再用水冲干净，就可以放心食用了！</span></p>\r\n\r\n<p><span style=\"font-size:medium\">　　21、【魅力男性所具有的12种特性】1、正义感；2、废话少，实事多；3、大度；4、执着；5、性情含蓄，喜怒不行于色；6、有深度；7、原则性强；8、为人处世稳重；9、可信赖；10、童心未泯；11、有梦；12、诚实永驻。</span></p>\r\n</div>\r\n', '1345551624', '2017-04-07 11:02:55', null, 'life');
INSERT INTO `article_tbl` VALUES ('55', '生活杂记', '<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">生活就像一杯咖啡，看似苦涩，但真正去品尝起来，柔滑香甜。总会有一种无法形容的感觉迷幻着你，从而俘虏你的思想。<br />\r\n　　生活是一首抒情的诗；生活是一支悠扬的歌；生活是一杯醇香的酒；生活是壶清香的茶；<br />\r\n　　生活是一位睿智的长者，生活是一位博学的老师，它常常春风化雨，润物无声地为我们指点迷津，给我们人生的启迪。<br />\r\n　　如果说人的一生原本是一张白纸，等待着我们用汗水去描绘自己奋斗、拼搏的轨迹，那么生活变是一支铅笔，用它纤细的身躯，在洁白的人生中流泻出风风雨雨&hellip;&hellip;<br />\r\n　　生活原来是一支铅笔，而不是其他的笔。因为铅笔具有不可复返性，一去不回，会不断地磨损、衰减，过一段就少一段。鉴于此，我们必须学会珍惜自己的时光，认真对待每一天。<br />\r\n　　生活原来是一支铅笔，线条简单是它最大的特点，黑色的线与白色的线相照应，搭配的朴素却不单调，富有哲理的韵味，流露出生命的真谛。<br />\r\n　　生活原来是一支铅笔，所有笔中，算它最正直，从不歪斜。铅笔也是最表里如一，它没有其他笔那样花哨，却向世人展现了最真实的自己。<br />\r\n　　生活原来是一支铅笔，它由我们近祖辈的大树制成，却从不倚老卖老，永远默默无闻地坚守自己的岗位，默默地奉献着。也正是由这无数的默默无闻取得了伟大的成就。<br />\r\n　　生命如花，咤紫嫣红；生命如歌，美妙动听；生活如酒，芳香清醇；生活如诗，意境深远，绚丽多彩。<br />\r\n　　生命和生活自古是两个形影不离的好友，拥有生命，才能创造美好的生活。拥有生活，才能衬托出生命的多姿多彩。<br />\r\n　　品味生活<br />\r\n　　生活就像一杯茶，要怎样才能沏好一杯香浓的生活之茶呢？？品味生活就像一杯葡萄酒，要怎样才能品出里面的甘甜呢？？<br />\r\n　　热水&middot;学习<br />\r\n　　首先准备一杯学习的热水。学习对于每个人来说都是必不可少的，一个人如果大字都不识几个，那他怎么与人交往，怎么成大事呢？学习是为了充实自己的头脑，让你的生活变得更有意义，对你是百利而无一害呀！数学使你思维敏捷，语文使你感情丰富，英语使你口语进步，生物使你了解大千世界．．． ．．．学习对你的身心发展是很有帮助的。当你真正塌下心来学习的时候，你会发现：学习并不是你想象的那么枯燥，它是十分有意思的。你会乐此不疲，渐渐的，你会爱上学习，你的生活已经离不开它了。<br />\r\n　　茶叶&middot;自信<br />\r\n　　然后要准备一些自信的茶叶。一杯香浓的茶是离不开茶叶的，相应于此，一段完美的人生是离不开自信的。当一个人自己都不相信自己了，别人再相信你，也无济于事。有些人甚至因为一点点小事就开始自暴自弃。干嘛自暴自弃呢？只要你自己看得起自己就行了啊！自卑的人只看到自己的缺点别人的优点，他却不知道每个人都不可能是完美的。失败了不要紧，扑扑土，继续走下去。只有相信自己，才能看到成功的彼岸。一个人少了自信就像茶水少了茶叶一样，无色无味，使你感到迷茫，甚至迷失方向。<br />\r\n　　白糖&middot;快乐<br />\r\n　　茶叶和水都齐了，加一些快乐的白糖吧。快乐是如糖般的调味剂，拥有快乐，生活就会变的多姿多彩。想拥有快乐，就要拥有一双善于发现快乐的眼睛，因为快乐无所不在，始终伴随着你：在生活中和学习中．．． ．．．当你和朋友分别的时候，你会怎么样？&ldquo;当然伤心了！&rdquo;错了，你也快乐起来才对。&ldquo;为什么呢？&rdquo;因为这次的离别就是下次相见的开端。走在路上，突然看见一个以前的好朋友，那是件多么令人快乐的事情啊！快乐，使你的生活不再单调。<br />\r\n　　蜂蜜&middot;宽容<br />\r\n　　最后，别忘了加一点宽容蜂蜜。因为宽容也是生活中不可缺少的一份子。因为你就算再自信，再快乐，学习再好，却心胸狭窄，自私自利，也会使你失去光彩。<br />\r\n　　好了。一杯香浓的生活之茶沏好了，让我们来细细地品味它吧．．． ．．．</span></span></p>\r\n', '1345551624', '2017-04-07 11:03:24', null, 'life');
INSERT INTO `article_tbl` VALUES ('57', 'Mybatis-log4j-1 日志记录', '<div>\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">今天系统的弄了一下Mybatis的log4j日志记录，相对于以前的使用，感觉提高了不少对他的使用和认知。废话不多说，先上代码：</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">Mybatis中log4j日志配置顺序如下：</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>1.首先应该在src根目录下面新建一个文件<span style=\"background-color:#e74c3c\">log4j.properties</span></strong></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">代码如下：</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">log4j.rootLogger=DEBUG,Console<br />\r\nlog4j.appender.Console=org.apache.log4j.ConsoleAppender<br />\r\nlog4j.appender.Console.layout=org.apache.log4j.PatternLayout<br />\r\nlog4j.appender.Console.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n<br />\r\nlog4j.logger.org.apache=INFO</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">代码分析如下：</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">文件中的内容是键值对的形式，&ldquo;=&rdquo;左边的是键，右边的是 值。</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.rootLogger=DEBUG,Console&nbsp;</strong>&nbsp;&nbsp;&nbsp;&nbsp; <strong>表示输出级别和位置</strong>。</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">输出级别有五种： Debug&nbsp;&nbsp; Info &nbsp;&nbsp; Warn&nbsp;&nbsp; Error&nbsp;&nbsp;&nbsp; Fatal，级别依次提高，当使用低级别的输出级别时候，大于等于此级别的输出形式都会输出。Console表示输出的位置：控制台。</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.appender.Console=org.apache.log4j.ConsoleAppender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 表示配置控制台的类</strong></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.appender.Console.layout=org.apache.log4j.PatternLayout&nbsp;&nbsp;&nbsp;&nbsp; 表示配置布局（自定义布局）</strong></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.appender.Console.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n&nbsp;&nbsp;&nbsp;&nbsp; 表示配置自定义布局的输出格式；</strong></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">%d产生日志的时间，<br />\r\n%t是产生日志所处的线程名称，<br />\r\n%-5p输出日志的级别，将占5位字符，不足5位用空格填补，-指的是在右边补齐（对齐方式）<br />\r\n%c你输出日志的包以及类的全名，<br />\r\n%m是你附加的信息<br />\r\n%n是换行</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.logger.com.dao.UserDao=INFO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 表示在总的工程输出级别下特殊化一个类的输出级别（此类：com.dao.UserDao），将其设置为INFO级别，会覆盖掉总的输出级别，对于此类</strong></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>2.将&nbsp; </strong><span style=\"background-color:#e74c3c\">log4j-1.2.17.jar&nbsp;</span> 这个jar包<strong>导入工程的WEB-INF/lib目录下</strong></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>3.注意哦：此种配置是应用在mybatis框架下面的工程</strong></span></span></p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>另外附加一个网址：可以简单了解一下Mybatis的日志记录配置：<span style=\"font-size:16px\"><span style=\"background-color:#1abc9c\">http://www.mybatis.org/mybatis-3/zh/logging.html</span></span></strong></span></span></p>\r\n</div>\r\n', '1345551624', '2017-04-07 11:04:17', null, 'technology');
INSERT INTO `article_tbl` VALUES ('61', '生活小常识', '<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">1、饮水机加柠檬去污渍：家里的茶壶。饮水机用久了，里面有一层白白后后的渣，这时不彷到市场买一颗柠檬，去籽外，切半放进饮水机或茶壶内煮个二或三小时，你会发现里面的渣变少了，多是几次，你会有满意的效果喔！</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">　　2、洋葱煮水去焦痕：若将铝制锅烧焦了，可在锅中放个洋葱和少许水加以煮沸，不久后所有的烧焦物都会浮起来！</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">　　3、茶水漱口好处多：茶叶可预防流感；还可预防牙龈出血；适度茶水，更可防治牙周炎！经常用茶水漱口，包你口腔健康哦！</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">　　4、【生活中的食物让你远离疾病痛苦】1、呕吐：吃蕃茄；2、口臭：多饮水；3、感冒：吃大蒜；4、高血压：喝橘子汁；5、脱发：吃红枣、牛排；6、牙出血：吃猕猴桃；7、打嗝：吃白糖。送给关心的人！</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">　　5、莲子美容羹：莲子30克，薏仁米50克，桂圆肉10克，蜂蜜适量，各种材料同煮至烂熟后加蜂蜜调味，经常食用有消除皱纹，白嫩肌肤的作用，祝你越来越年轻！</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">　　6、清水加白醋为花朵延寿：炎炎夏日，鲜花买回家后容易枯萎，不彷清水中加几滴白醋或漂白水，花枝底部再修剪一下，即可使花朵延年益寿喔！</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">　　7、【八种应对酒后不适的解酒方法】1、蜂蜜水：酒后头痛；2、西红柿汁：酒后头晕；3、新鲜葡萄：酒后反胃、恶心；4、西瓜汁：酒后全身发热；5、柚子：酒后口气；6、芹菜汁：酒后胃肠不适、颜面发红；7、酸奶：酒后烦躁；8、香蕉：酒后心悸、胸闷。</span></span></p>\r\n', '1', '2017-04-07 19:09:32', null, 'life');
INSERT INTO `article_tbl` VALUES ('62', '生活杂记', '<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">生活就像一杯咖啡，看似苦涩，但真正去品尝起来，柔滑香甜。总会有一种无法形容的感觉迷幻着你，从而俘虏你的思想。<br />\r\n　　生活是一首抒情的诗；生活是一支悠扬的歌；生活是一杯醇香的酒；生活是壶清香的茶；<br />\r\n　　生活是一位睿智的长者，生活是一位博学的老师，它常常春风化雨，润物无声地为我们指点迷津，给我们人生的启迪。<br />\r\n　　如果说人的一生原本是一张白纸，等待着我们用汗水去描绘自己奋斗、拼搏的轨迹，那么生活变是一支铅笔，用它纤细的身躯，在洁白的人生中流泻出风风雨雨&hellip;&hellip;<br />\r\n　　生活原来是一支铅笔，而不是其他的笔。因为铅笔具有不可复返性，一去不回，会不断地磨损、衰减，过一段就少一段。鉴于此，我们必须学会珍惜自己的时光，认真对待每一天。<br />\r\n　　生活原来是一支铅笔，线条简单是它最大的特点，黑色的线与白色的线相照应，搭配的朴素却不单调，富有哲理的韵味，流露出生命的真谛。<br />\r\n　　生活原来是一支铅笔，所有笔中，算它最正直，从不歪斜。铅笔也是最表里如一，它没有其他笔那样花哨，却向世人展现了最真实的自己。<br />\r\n　　生活原来是一支铅笔，它由我们近祖辈的大树制成，却从不倚老卖老，永远默默无闻地坚守自己的岗位，默默地奉献着。也正是由这无数的默默无闻取得了伟大的成就。<br />\r\n　　生命如花，咤紫嫣红；生命如歌，美妙动听；生活如酒，芳香清醇；生活如诗，意境深远，绚丽多彩。<br />\r\n　　生命和生活自古是两个形影不离的好友，拥有生命，才能创造美好的生活。拥有生活，才能衬托出生命的多姿多彩。<br />\r\n　　品味生活<br />\r\n　　生活就像一杯茶，要怎样才能沏好一杯香浓的生活之茶呢？？品味生活就像一杯葡萄酒，要怎样才能品出里面的甘甜呢？？<br />\r\n　　热水&middot;学习<br />\r\n　　首先准备一杯学习的热水。学习对于每个人来说都是必不可少的，一个人如果大字都不识几个，那他怎么与人交往，怎么成大事呢？学习是为了充实自己的头脑，让你的生活变得更有意义，对你是百利而无一害呀！数学使你思维敏捷，语文使你感情丰富，英语使你口语进步，生物使你了解大千世界．．． ．．．学习对你的身心发展是很有帮助的。当你真正塌下心来学习的时候，你会发现：学习并不是你想象的那么枯燥，它是十分有意思的。你会乐此不疲，渐渐的，你会爱上学习，你的生活已经离不开它了。<br />\r\n　　茶叶&middot;自信<br />\r\n　　然后要准备一些自信的茶叶。一杯香浓的茶是离不开茶叶的，相应于此，一段完美的人生是离不开自信的。当一个人自己都不相信自己了，别人再相信你，也无济于事。有些人甚至因为一点点小事就开始自暴自弃。干嘛自暴自弃呢？只要你自己看得起自己就行了啊！自卑的人只看到自己的缺点别人的优点，他却不知道每个人都不可能是完美的。失败了不要紧，扑扑土，继续走下去。只有相信自己，才能看到成功的彼岸。一个人少了自信就像茶水少了茶叶一样，无色无味，使你感到迷茫，甚至迷失方向。</span></span></span></p>\r\n', '1', '2017-04-07 19:10:04', null, 'life');
INSERT INTO `article_tbl` VALUES ('64', 'Mybatis-log4j-1 日志记录', '<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">今天系统的弄了一下Mybatis的log4j日志记录，相对于以前的使用，感觉提高了不少对他的使用和认知。废话不多说，先上代码：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">Mybatis中log4j日志配置顺序如下：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>1.首先应该在src根目录下面新建一个文件<span style=\"background-color:#e74c3c\">log4j.properties</span></strong></span></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">代码如下：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">log4j.rootLogger=DEBUG,Console<br />\r\nlog4j.appender.Console=org.apache.log4j.ConsoleAppender<br />\r\nlog4j.appender.Console.layout=org.apache.log4j.PatternLayout<br />\r\nlog4j.appender.Console.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n<br />\r\nlog4j.logger.org.apache=INFO</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">代码分析如下：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">文件中的内容是键值对的形式，&ldquo;=&rdquo;左边的是键，右边的是 值。</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.rootLogger=DEBUG,Console&nbsp;</strong>&nbsp;&nbsp;&nbsp;&nbsp; <strong>表示输出级别和位置</strong>。</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">输出级别有五种： Debug&nbsp;&nbsp; Info &nbsp;&nbsp; Warn&nbsp;&nbsp; Error&nbsp;&nbsp;&nbsp; Fatal，级别依次提高，当使用低级别的输出级别时候，大于等于此级别的输出形式都会输出。Console表示输出的位置：控制台。</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.appender.Console=org.apache.log4j.ConsoleAppender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 表示配置控制台的类</strong></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.appender.Console.layout=org.apache.log4j.PatternLayout&nbsp;&nbsp;&nbsp;&nbsp; 表示配置布局（自定义布局）</strong></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>log4j.appender.Console.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n&nbsp;&nbsp;&nbsp;&nbsp; 表示配置自定义布局的输出格式；</strong></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">%d产生日志的时间，<br />\r\n%t是产生日志所处的线程名称，<br />\r\n%-5p输出日志的级别，将占5位字符，不足5位用空格填补，-指的是在右边补齐（对齐方式）<br />\r\n%c你输出日志的包以及类的全名，</span></span></span></p>\r\n', '1', '2017-04-07 19:11:13', null, 'life');
INSERT INTO `article_tbl` VALUES ('65', '什么是会计', '<div>\r\n<div><span style=\"font-size:medium\"><span style=\"font-size:medium\"><strong>会计是以货币为主要计量单位，运用专门的方法，核算和监督一个单位经济活动的一种经济管理工作。</strong><strong>会计</strong>是以货币为主要的计量单位，以凭证为主要的依据，借助于专门的技术方法，对一定单位的资金运动进行全面、综合、连续、系统的核算与监督，向有关方面提供会计信息、参与经营管理、旨在提高经济效益的一种经济管理活动。古义是集会议事。我国从周代就有了专设的会计官职，掌管赋税收入、钱银支出等财务工作，进行月计、岁会。亦即，每月零星盘算为&ldquo;计&rdquo;，一年总盘算为&ldquo;会&rdquo;，两者合在一起即成&ldquo;会计&rdquo;。</span></span></div>\r\n</div>\r\n\r\n<div>&nbsp;</div>\r\n\r\n<div>\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">中文名</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">会计</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">外文名</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">Accountant</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">简&nbsp;&nbsp;&nbsp;&nbsp;称</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">ACCT</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">分&nbsp;&nbsp;&nbsp;&nbsp;类</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">中式和西式</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">系&nbsp;&nbsp;&nbsp;&nbsp;别</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">管理系（经济管理类）</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">发&nbsp;&nbsp;&nbsp;&nbsp;展</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">古代、近代、现代</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">职&nbsp;&nbsp;&nbsp;&nbsp;能</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">核算、监督、其他职能</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">相关证书</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">会计从业资格证、初级会计</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">相关证书</span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\">中级会计、高级会计、注册会计师</span></span></p>\r\n</div>\r\n\r\n<div>\r\n<div>\r\n<h2><span style=\"font-size:medium\"><span style=\"font-size:medium\">目录</span></span></h2>\r\n\r\n<div>\r\n<ol>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">1 概念解释</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 基本特征</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 对象</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 目标</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 职能</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">2 工作内容</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">3 岗位职责</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">4 会计职称</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">5 会计准则</span></span></li>\r\n</ol>\r\n\r\n<ol>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 总则</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 会计信息质量要求</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 资产</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">6 新会计从业资格管理办法</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">7 发展阶段</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 古代会计阶段</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 近代会计阶段</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 现代会计阶段</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">8 会计分类</span></span></li>\r\n</ol>\r\n\r\n<ol>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">9 会计要素</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">10 科目设置</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">11 岗位划分</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">12 会计从业资格</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 会计从业资格要求</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 会计职称</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 相关证书</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">13 专有名词</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 基本假设</span></span></li>\r\n</ol>\r\n\r\n<ol>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 会计方法</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">14 专业自考</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 专业介绍</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 培养目标</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 培养要求</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">▪ 就业方向</span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\">15 考试</span></span></li>\r\n</ol>\r\n</div>\r\n</div>\r\n</div>\r\n', '1', '2017-04-07 19:12:35', null, 'life');
INSERT INTO `article_tbl` VALUES ('66', 'Mybatis中配置别名-使得Mapper中可以使用较短的名称代替类', '<div>\r\n<div>\r\n<div>\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">在大的项目中使用别名可以大大的减少程序员的编码量以及节约时间。对于程序员是个不错的选择。废话不多说，直接上代码：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">首先对于别名的使用，有两种场合的使用。</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">第一种：对于专门的一种类的别名定义：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">代码如下：</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>&lt;typeAlias&nbsp;&nbsp; type=&quot;com.entity.User&quot;&nbsp;&nbsp; alias=&quot;user&quot; /&gt;</strong></span><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; type:写上要使用别名的类的完全限定名。</strong><span style=\"font-size:14px\"><strong>alias：自定义的别名</strong></span></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">第二种：对于批量为类指定别名（以包为基本单位）</span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>&lt;typeAliases&gt;</strong></span></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>&lt;package&nbsp;&nbsp; name=&quot;com.entity&quot;&gt;</strong></span></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>&lt;/typeAliases&gt;</strong></span></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:14px\"><strong>包：com.entity中的类都被别名化，别名均为：首字母小写的类名</strong></span></span></span></span></p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">好处：在mapper中的xml文件中，对于类的引用地方，均可以使用别名代替，减少了工作量，是个不错的选择。至于选择哪种别名化的方式，取决于自己面对的实际情况。</span></span></span></p>\r\n</div>\r\n</div>\r\n</div>\r\n', '1', '2017-04-07 19:13:06', null, 'life');
INSERT INTO `article_tbl` VALUES ('67', 'Java微信公众平台开发之生成带参二维码 ', '<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">目前有2种类型的二维码：<br />\r\n1、临时二维码，是有过期时间的，最长可以设置为在二维码生成后的30天（即2592000秒）后过期，但能够生成较多数量，主要用于帐号绑定等不要求二维码永久保存的业务场景<br />\r\n2、永久二维码，是无过期时间的，但数量较少（目前为最多10万个），主要用于适用于帐号绑定、用户来源统计等场景</span></span></span></p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">参考文档详见https://mp.weixin.qq.com/wiki?t=resource/res_main&amp;id=mp1443433542&amp;token=&amp;lang=zh_CN</span></span></span></p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">获取带参数的二维码的过程包括两步，首先创建二维码ticket，然后凭借ticket到指定URL换取二维码，但是得到ticket之前首先获取到access_token。</span></span></span></p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">1.首先创建个access_token的bean</span></span></span></p>\r\n\r\n<div>\r\n<ol start=\"1\">\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">public&nbsp;class&nbsp;AccessToken&nbsp;{&nbsp;&nbsp;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;获取到的凭证&nbsp;&nbsp;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;token;&nbsp;&nbsp;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;凭证有效时间，单位：秒&nbsp;&nbsp;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;int&nbsp;expiresIn;&nbsp;&nbsp;</span></span></span></li>\r\n	<li>&nbsp;</li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getToken()&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;token;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setToken(String&nbsp;token)&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.token&nbsp;=&nbsp;token;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;int&nbsp;getExpiresIn()&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;expiresIn;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setExpiresIn(int&nbsp;expiresIn)&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.expiresIn&nbsp;=&nbsp;expiresIn;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</span></span></span></li>\r\n	<li>&nbsp;</li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">}&nbsp;&nbsp;</span></span></span></li>\r\n</ol>\r\n</div>\r\n\r\n<p><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp; 2.创建获取accessToken的方法</span></span></span></p>\r\n\r\n<div>\r\n<ol start=\"1\">\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">public&nbsp;class&nbsp;WechatUtil&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li>&nbsp;</li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;final&nbsp;Logger&nbsp;logger&nbsp;=&nbsp;Logger.getLogger(WechatUtil.class);&nbsp;&nbsp;</span></span></span></li>\r\n	<li>&nbsp;</li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;获取access_token的接口地址（GET）&nbsp;限200(次/天)&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;final&nbsp;static&nbsp;String&nbsp;access_token_url&nbsp;=&nbsp;&quot;https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&amp;appid=APPID&amp;secret=APPSECRET&quot;;&nbsp;&nbsp;</span></span></span></li>\r\n	<li>&nbsp;</li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;菜单创建（POST）&nbsp;限100（次/天）&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;String&nbsp;menu_create_url&nbsp;=&nbsp;&quot;https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN&quot;;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;/**&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;获取access_token&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;appid&nbsp;凭证&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@param&nbsp;appsecret&nbsp;密钥&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;@return&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;AccessToken&nbsp;getAccessToken(String&nbsp;appid,&nbsp;String&nbsp;appsecret)&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AccessToken&nbsp;accessToken&nbsp;=&nbsp;null;&nbsp;&nbsp;</span></span></span></li>\r\n	<li>&nbsp;</li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;requestUrl&nbsp;=&nbsp;access_token_url.replace(&quot;APPID&quot;,&nbsp;appid).replace(&quot;APPSECRET&quot;,&nbsp;appsecret);&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JSONObject&nbsp;jsonObject&nbsp;=&nbsp;HttpRequestUtil.httpRequestJSONObject(requestUrl,&nbsp;HttpRequestUtil.GET_METHOD,&nbsp;null);&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;如果请求成功&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;jsonObject)&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;try&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;accessToken&nbsp;=&nbsp;new&nbsp;AccessToken();&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;accessToken.setToken(jsonObject.getString(&quot;access_token&quot;));&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;accessToken.setExpiresIn(jsonObject.getInt(&quot;expires_in&quot;));&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;catch&nbsp;(JSONException&nbsp;e)&nbsp;{&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;accessToken&nbsp;=&nbsp;null;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;获取token失败&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(&quot;获取token失败&nbsp;errcode:&quot;+jsonObject.getInt(&quot;errcode&quot;)&nbsp;+&quot;,errmsg:&quot;+&nbsp;jsonObject.getString(&quot;errmsg&quot;));&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span></span></li>\r\n	<li><span style=\"font-size:medium\"><span style=\"font-size:medium\"><span style=\"font-size:medium\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</span></span></span></li>\r\n</ol>\r\n</div>\r\n', '1', '2017-04-07 19:13:33', null, 'life');
INSERT INTO `article_tbl` VALUES ('70', 'www', '<p>&lt;pre&gt;HttpServletRequest&nbsp;&nbsp; request=(HttpServletRequest)arg0;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; HttpServletResponse&nbsp; response=(HttpServletResponse)arg1;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;// TODO Auto-generated method stub<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;Boolean&nbsp; flag=false;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;String&nbsp; servletPath=((HttpServletRequest) arg0).getServletPath();<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;User&nbsp;&nbsp; user=(User) ((HttpServletRequest) arg0).getSession().getAttribute(&quot;user&quot;);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;for (String s : IGNORE_URI) {<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;if(servletPath.contains(s))<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;{<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;System.out.println(&quot;2步&quot;);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;flag=true;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;break;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;if(flag)<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;{<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;arg2.doFilter(arg0, arg1);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;else<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;{<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;if(null!=user)<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;{<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;System.out.println(&quot;3步&quot;);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;flag=true;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;arg2.doFilter(arg0, arg1);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;else<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;{<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;System.out.println(&quot;4步&quot;);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;/*arg0.setAttribute(&quot;message&quot;, &quot;请确认注册拥有账户登录&quot;);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;flag=false;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;arg0.getRequestDispatcher(&quot;Login&quot;).forward(arg0, arg1);*/<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;//只能返回控制器<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;response.sendRedirect(&quot;Blogger&quot;);<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}&nbsp;&nbsp; &nbsp;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;}&nbsp;&nbsp; &nbsp;&nbsp; &lt;/pre&gt;</p>\r\n', '1', '2017-04-13 12:42:54', null, 'technology');
INSERT INTO `article_tbl` VALUES ('71', 'sss', '<p>&nbsp; &lt;/head&gt;<br />\r\n&nbsp;<br />\r\n&nbsp; &lt;body style=&quot;background-color: #4D4D4D;&quot;&gt;<br />\r\n&nbsp; &lt;div&nbsp;&nbsp; class=&quot;container&quot; style=&quot;background-color: RGB(238,232,171);&quot;&gt;<br />\r\n&nbsp; &lt;jsp:include page=&quot;/Header4.jsp&quot;&gt;&lt;/jsp:include&gt;<br />\r\n&nbsp;<br />\r\n&nbsp; &lt;div&nbsp; class=&quot;row&quot;&gt;<br />\r\n&nbsp; &lt;div&nbsp; class=&quot;col-md-8&quot;&gt;<br />\r\n&nbsp; &lt;div class=&quot;panel panel-success&quot;&gt;<br />\r\n&nbsp; &lt;h2&gt;${article.title}&lt;/h2&gt;<br />\r\n&nbsp; &lt;p&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;${date}&lt;/p&gt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<br />\r\n&nbsp; &lt;div class=&quot;panel-body&quot;&nbsp; style=&quot;WORD-WRAP: break-word;word-break:break-all;line-height:3px;&quot;&gt;&lt;font&nbsp;&nbsp; size=&quot;3&quot;&gt;${article.content}&lt;/font&gt;&lt;/div&gt;<br />\r\n&nbsp; &lt;/div&gt;&lt;br&gt;<br />\r\n&nbsp;&nbsp; &lt;div class=&quot;panel-body&quot; &gt;<br />\r\n&nbsp;&nbsp; &lt;h3&gt;文章评论&lt;/h3&gt;<br />\r\n&nbsp;&nbsp; &lt;c:forEach&nbsp;&nbsp; var=&quot;comment&quot;&nbsp;&nbsp;&nbsp; items=&quot;${listComment}&quot;&gt;<br />\r\n&nbsp;&nbsp; &lt;div class=&quot;panel panel-default&quot;&gt;<br />\r\n&nbsp;&nbsp; &nbsp;&lt;div class=&quot;panel-heading&quot;&gt;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&lt;h3 class=&quot;panel-title&quot;&gt;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&lt;span class=&quot;glyphicon glyphicon-hand-right&quot;&gt;&lt;/span&gt;&amp;nbsp;&amp;nbsp;${comment.user_nickname}评价<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&lt;/h3&gt;<br />\r\n&nbsp;&nbsp; &nbsp;&lt;/div&gt;<br />\r\n&nbsp;&nbsp; &nbsp;&lt;div class=&quot;panel-body&quot;&gt;<br />\r\n&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; ${comment.content}<br />\r\n&nbsp;&nbsp; &nbsp;&lt;/div&gt;<br />\r\n&lt;/div&gt;<br />\r\n&nbsp;&nbsp; &lt;/c:forEach&gt;<br />\r\n&nbsp;&nbsp;&nbsp; &lt;/div&gt;&lt;br&gt;</p>\r\n', '1', '2017-04-13 12:57:26', null, 'technology');
INSERT INTO `article_tbl` VALUES ('79', '我是', '<p>mmm</p>\r\n', '1', '2017-04-18 15:00:31', null, 'technology');
INSERT INTO `article_tbl` VALUES ('80', 'Android 中的IPC机制  ', '<p>版权声明：本文为博主原创文章，未经博主允许不得转载。</p>\r\n\r\n<div>\r\n<div>\r\n<p>《Android开发艺术探讨》之 Android IPC 介绍</p>\r\n\r\n<p>IPC是 Inter-Proscess Communication的缩写，含义为进程间的通讯或者跨进程通讯，是指两个进程之间进行数据交换的过程。按操作系统的中的描述，线程是CPU调度最小的单元，同时线程是一种有限的系统资源，而进程是指一个执行单元，在PC和移动设备上指一个程序或者一个应用。一个进程可以包含多个线程，因此进程和线程是包含于被包含的关系。</p>\r\n\r\n<p>IPC的使用场景就必须提到多进程，只有面对多进程这种场景下，才需要考虑进程间通讯。多进程的情况分为两种：第一种是一个应用因为某些原因自身需要采用多进程模式来实现，原因有很多，应用特殊原因需要运行的单独的进程中，或者为了加大一个应用可使用内存所以需要通过多进程来获取多分内存空间。另外一种情况是：当前应用需要向其他应用获取数据，由于是两个应用，所以必须采取跨进程方式来获取所需要数据。</p>\r\n\r\n<p>Android中的多进程模式</p>\r\n\r\n<p>开启Android多进程模式很简单，就是给四大组件（Activity,Service,Receiver,ContentProvider）在AndroidMenifest中指定android:process属性。另外还有一种非常规的做法，那就是通过JNI在native层去fork一个新的进程。</p>\r\n\r\n<p>给process指定多进程有两种不同的形式</p>\r\n\r\n<ul>\r\n	<li>：remote<br />\r\n	进程名以 &ldquo;:&rdquo;的含义是指要在进程名前面附加上当前的包名，这个进程属于当前应用的私有进程，其他应用不可以和他跑在同一个进程。</li>\r\n	<li>com.xxx.xxx<br />\r\n	这种属于全局进程，其他应用可以通过ShareUID方式可以和它跑在同一个进程，我们都知道系统会为每个应用分配一个唯一的UID，具有相同UID的应用才能共享数据。两个应用通过ShareUID跑在同一个进程，是需要相同的ShareUID并且签名相同才可以。不管它们是不是跑在同一个进程中，具有相同ShareUID的它们可以访问对方的私有数据，如：data目录、组件信息等。当然如果是在同一个进程中，除了data目录、组件信息还能共享内存数据。</li>\r\n</ul>\r\n\r\n<p>多进程运行机制</p>\r\n\r\n<p>我们知道Android为每一个应用分配了一个独立的虚拟机，或者说为每一个进程都分配了一个独立的虚拟机，不同的虚拟机在内存分配上有不同的地址空间，这就导致在不同的虚拟机访问同一个类的对象会产生多分副本。</p>\r\n\r\n<p>所有运行在不同进程中的四大组件，只要它们之间需要通过内存来共享数据，都会共享失败，这也是多进程所带来的主要影响，一般来说，使用多进程会造成如下几方面的问题。</p>\r\n\r\n<ul>\r\n	<li>静态成员和单例模式完全失效（都是不同的虚拟机）</li>\r\n	<li>线程同步机制完全失效（都不是同一块内存了）</li>\r\n	<li>SharePreferences 的可靠性下降（底层通过XML去执行操作的，并发很可能出问题，甚至并发读、写都有可能出问题）</li>\r\n	<li>Application会多次创建（当一个组件跑在一个新的进程中，由于系统要在创建新的进程同时分配独立的虚拟机，所以这个过程其实就是启动一个应用的过程，因此系统又把这个应用重新启动了一遍，既然都重新启动了，那么自然会创建新的Application）</li>\r\n</ul>\r\n\r\n<p>IPC基础概念介绍</p>\r\n\r\n<ul>\r\n	<li>Serializable接口<br />\r\n	Serializable是Java所提供的一个序列号接口，它是一个空接口，为对象提供标准的序列化和反序列化操作。使用Serializable相当简单，只需要实现Serializable接口并声明一个serialVersionUID,其实这个serialVersionUID也不是必需的，如果不声明这个serialVersionUID也是可以实现序列化的，但是这将会对反序列化过程产生影响。<br />\r\n	//序列化</li>\r\n</ul>\r\n\r\n<pre>\r\n User user = new User(&quot;xia&quot;,&quot;123455&quot;);\r\n              ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(&quot;cache.txt&quot;));\r\n              out.write(user);\r\n              out.close();\r\n              //反序列化\r\n              ObjectInputStream in = new ObjectInputStream(new FileInputStream(&quot;cache.txt&quot;));\r\n              User newUser = (User)in.readObject();\r\n              in.close(); </pre>\r\n\r\n<ul>\r\n	<li>1</li>\r\n	<li>2</li>\r\n	<li>3</li>\r\n	<li>4</li>\r\n	<li>5</li>\r\n	<li>6</li>\r\n	<li>7</li>\r\n	<li>8</li>\r\n</ul>\r\n\r\n<div><img src=\"http://static.blog.csdn.net/images/save_snippets.png\" /></div>\r\n\r\n<ul>\r\n	<li>1</li>\r\n	<li>2</li>\r\n	<li>3</li>\r\n	<li>4</li>\r\n	<li>5</li>\r\n	<li>6</li>\r\n	<li>7</li>\r\n	<li>8</li>\r\n</ul>\r\n\r\n<p>serialVersionUID是用来辅助序列化和反序列化过程的，原则上序列化后的数据中serialVersionUID只有和当前类serialVersionUID相同才能够正常的被反序列化。serialVersionUID的详细工作机制是这样的：序列化的时候系统会把当前类的serialVersionUID写入序列化的文件中（也可能是其他中介），但反序列化的时候会去检测文件中的serialVersionUID，看它是否和当前类的serialVersionUID一致，如果一致就说明序列化的版本和当前版本是相同的，这个时候可以成功的反序列化，否则就说明当前类和序列化的类相比发生了某些变换，比如成员变量的数量、类型发生了改变，这个时候无法正常反序列化。<br />\r\n一般来说，我们应该手动指定serialVersionUID的值，如1L，也可以根据自身结构自动去生成它的hash值，这样序列化和反序列化时两者的serialVersionUID是相同的。如果不指定serialVersionUID的值，反序列化时当前类有所改变，比如增加或者删除了某些成员变量，那么系统就会重新计算当前类型的hash值并把它赋值给serialVersionUID，这个时候当前类的serialVersionUID就和序列化数据中的serialVersionUID不一致，于是反序列化失败，程序就会出现crash。所以避免反序列化过程的失败。比如当版本升级后，我们很可能删除了某个成员变量也可能增加了一些新的成员变量，这个时候序列化过程仍然能够成功，程序可以最大限度地恢复数据，相反，如果不指定serialVersionUID的话，程序则会挂掉。当然我们还要考虑另外一种情况，如果类的结构发生了非常规性的改变，比如修改了类名，修改了成员变量的类型，这个时候尽管serialVersionUID验证通过，但是反序列化还是会失败，因为类结构有了毁灭性的改变，根本无法从老版本的数据中还原出一个新的类结构对象。<br />\r\n静态成员变量属于类不属于对象，所以不会参与序列化过程，其次用transient关键字标记的成员变量不参与序列化配置。<br />\r\n- Parceable 接口</p>\r\n</div>\r\n</div>\r\n', '1', '2017-04-19 07:21:40', null, 'technology');

-- ----------------------------
-- Table structure for character_tbl
-- ----------------------------
DROP TABLE IF EXISTS `character_tbl`;
CREATE TABLE `character_tbl` (
  `user_username` varchar(11) NOT NULL,
  `blogtitle` varchar(50) DEFAULT NULL,
  `signature` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_username`),
  CONSTRAINT `character_tbl_ibfk_1` FOREIGN KEY (`user_username`) REFERENCES `user_tbl` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of character_tbl
-- ----------------------------
INSERT INTO `character_tbl` VALUES ('1', '曙光', '曙光');

-- ----------------------------
-- Table structure for click_tbl
-- ----------------------------
DROP TABLE IF EXISTS `click_tbl`;
CREATE TABLE `click_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` date NOT NULL,
  `article_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `article_id` (`article_id`),
  CONSTRAINT `click_tbl_ibfk_1` FOREIGN KEY (`article_id`) REFERENCES `article_tbl` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of click_tbl
-- ----------------------------

-- ----------------------------
-- Table structure for comment_tbl
-- ----------------------------
DROP TABLE IF EXISTS `comment_tbl`;
CREATE TABLE `comment_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `username` varchar(11) NOT NULL,
  `article_id` int(11) NOT NULL,
  `user_nickname` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `article_id` (`article_id`),
  CONSTRAINT `comment_tbl_ibfk_1` FOREIGN KEY (`article_id`) REFERENCES `article_tbl` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_tbl
-- ----------------------------

-- ----------------------------
-- Table structure for image_tbl
-- ----------------------------
DROP TABLE IF EXISTS `image_tbl`;
CREATE TABLE `image_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(100) DEFAULT NULL,
  `user_username` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_username` (`user_username`),
  CONSTRAINT `image_tbl_ibfk_1` FOREIGN KEY (`user_username`) REFERENCES `user_tbl` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of image_tbl
-- ----------------------------
INSERT INTO `image_tbl` VALUES ('86', 'images/120170423193624445.jpg', '1');
INSERT INTO `image_tbl` VALUES ('87', 'images/120170423193708677.jpg', '1');
INSERT INTO `image_tbl` VALUES ('88', 'images/120170423194159939.jpg', '1');
INSERT INTO `image_tbl` VALUES ('89', 'images/120170423194345335.jpg', '1');
INSERT INTO `image_tbl` VALUES ('90', 'images/120170423194452134.jpg', '1');
INSERT INTO `image_tbl` VALUES ('91', 'images/120170423194706920.jpg', '1');
INSERT INTO `image_tbl` VALUES ('109', 'SunnyImagesCharacter/1.jpg', '1');
INSERT INTO `image_tbl` VALUES ('170', 'SunnyImagesCharacter/1.jpg', '3');
INSERT INTO `image_tbl` VALUES ('172', 'SunnyImagesCharacter/1.jpg', '2');
INSERT INTO `image_tbl` VALUES ('176', 'SunnyImagesCharacter/2.jpg', '2');

-- ----------------------------
-- Table structure for ji
-- ----------------------------
DROP TABLE IF EXISTS `ji`;
CREATE TABLE `ji` (
  `id` int(11) DEFAULT NULL,
  `time` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ji
-- ----------------------------
INSERT INTO `ji` VALUES (null, '2017-03-29');

-- ----------------------------
-- Table structure for kindarticle
-- ----------------------------
DROP TABLE IF EXISTS `kindarticle`;
CREATE TABLE `kindarticle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kind_name` varchar(50) NOT NULL,
  `user_username` varchar(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_username` (`user_username`),
  CONSTRAINT `kindarticle_ibfk_1` FOREIGN KEY (`user_username`) REFERENCES `user_tbl` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kindarticle
-- ----------------------------
INSERT INTO `kindarticle` VALUES ('6', 'life', '1');
INSERT INTO `kindarticle` VALUES ('7', 'life', '1');
INSERT INTO `kindarticle` VALUES ('8', 'life', '1');
INSERT INTO `kindarticle` VALUES ('9', 'life', '1');
INSERT INTO `kindarticle` VALUES ('10', 'life', '1');
INSERT INTO `kindarticle` VALUES ('11', 'life', '1');
INSERT INTO `kindarticle` VALUES ('12', 'life', '1');
INSERT INTO `kindarticle` VALUES ('13', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('14', 'life', '1');
INSERT INTO `kindarticle` VALUES ('15', 'life', '1');
INSERT INTO `kindarticle` VALUES ('16', 'life', '1');
INSERT INTO `kindarticle` VALUES ('17', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('18', 'life', '1');
INSERT INTO `kindarticle` VALUES ('19', 'life', '1');
INSERT INTO `kindarticle` VALUES ('20', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('21', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('22', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('23', 'life', '1');
INSERT INTO `kindarticle` VALUES ('24', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('25', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('26', 'life', '1');
INSERT INTO `kindarticle` VALUES ('27', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('28', 'life', '1');
INSERT INTO `kindarticle` VALUES ('29', 'life', '1');
INSERT INTO `kindarticle` VALUES ('30', 'life', '1');
INSERT INTO `kindarticle` VALUES ('31', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('32', 'life', '1');
INSERT INTO `kindarticle` VALUES ('33', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('34', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('35', 'life', '1');
INSERT INTO `kindarticle` VALUES ('36', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('37', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('38', 'life', '1');
INSERT INTO `kindarticle` VALUES ('39', 'life', '1');
INSERT INTO `kindarticle` VALUES ('40', 'life', '1');
INSERT INTO `kindarticle` VALUES ('41', 'life', '1');
INSERT INTO `kindarticle` VALUES ('42', 'life', '1');
INSERT INTO `kindarticle` VALUES ('43', 'life', '1');
INSERT INTO `kindarticle` VALUES ('44', 'life', '1');
INSERT INTO `kindarticle` VALUES ('45', 'life', '1');
INSERT INTO `kindarticle` VALUES ('46', 'life', '1');
INSERT INTO `kindarticle` VALUES ('47', 'life', '1');
INSERT INTO `kindarticle` VALUES ('48', 'life', '1');
INSERT INTO `kindarticle` VALUES ('49', 'life', '1');
INSERT INTO `kindarticle` VALUES ('50', 'life', '1');
INSERT INTO `kindarticle` VALUES ('51', 'life', '1');
INSERT INTO `kindarticle` VALUES ('52', 'life', '1');
INSERT INTO `kindarticle` VALUES ('53', 'life', '1');
INSERT INTO `kindarticle` VALUES ('54', 'life', '1');
INSERT INTO `kindarticle` VALUES ('55', 'life', '1');
INSERT INTO `kindarticle` VALUES ('56', 'life', '1');
INSERT INTO `kindarticle` VALUES ('57', 'life', '1');
INSERT INTO `kindarticle` VALUES ('58', 'life', '1');
INSERT INTO `kindarticle` VALUES ('59', 'life', '1');
INSERT INTO `kindarticle` VALUES ('60', 'life', '1');
INSERT INTO `kindarticle` VALUES ('61', 'life', '1');
INSERT INTO `kindarticle` VALUES ('62', 'life', '1');
INSERT INTO `kindarticle` VALUES ('63', 'life', '1');
INSERT INTO `kindarticle` VALUES ('64', 'life', '1');
INSERT INTO `kindarticle` VALUES ('65', 'life', '1');
INSERT INTO `kindarticle` VALUES ('66', 'life', '1');
INSERT INTO `kindarticle` VALUES ('67', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('68', 'life', '1');
INSERT INTO `kindarticle` VALUES ('69', 'life', '1');
INSERT INTO `kindarticle` VALUES ('70', 'life', '1');
INSERT INTO `kindarticle` VALUES ('71', 'life', '1');
INSERT INTO `kindarticle` VALUES ('72', 'life', '1');
INSERT INTO `kindarticle` VALUES ('73', 'life', '1');
INSERT INTO `kindarticle` VALUES ('74', 'life', '1');
INSERT INTO `kindarticle` VALUES ('75', 'life', '1');
INSERT INTO `kindarticle` VALUES ('76', 'life', '1');
INSERT INTO `kindarticle` VALUES ('77', 'life', '1');
INSERT INTO `kindarticle` VALUES ('78', 'life', '1');
INSERT INTO `kindarticle` VALUES ('79', 'life', '1');
INSERT INTO `kindarticle` VALUES ('80', 'life', '1');
INSERT INTO `kindarticle` VALUES ('81', 'life', '1');
INSERT INTO `kindarticle` VALUES ('82', 'life', '1');
INSERT INTO `kindarticle` VALUES ('83', 'life', '1');
INSERT INTO `kindarticle` VALUES ('84', 'life', '1');
INSERT INTO `kindarticle` VALUES ('85', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('86', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('87', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('88', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('89', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('90', 'knowledge', '1');
INSERT INTO `kindarticle` VALUES ('91', 'life', '1');
INSERT INTO `kindarticle` VALUES ('92', 'life', '1');
INSERT INTO `kindarticle` VALUES ('93', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('94', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('95', 'life', '1');
INSERT INTO `kindarticle` VALUES ('96', 'life', '1');
INSERT INTO `kindarticle` VALUES ('97', 'life', '1');
INSERT INTO `kindarticle` VALUES ('98', 'life', '1');
INSERT INTO `kindarticle` VALUES ('99', 'life', '1');
INSERT INTO `kindarticle` VALUES ('100', 'life', '1');
INSERT INTO `kindarticle` VALUES ('101', 'life', '1');
INSERT INTO `kindarticle` VALUES ('102', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('103', 'technology', '1');
INSERT INTO `kindarticle` VALUES ('104', 'life', '1');
INSERT INTO `kindarticle` VALUES ('105', 'life', '1');
INSERT INTO `kindarticle` VALUES ('106', 'life', '1');
INSERT INTO `kindarticle` VALUES ('107', 'life', '1');
INSERT INTO `kindarticle` VALUES ('108', 'life', '1');
INSERT INTO `kindarticle` VALUES ('109', 'life', '1');
INSERT INTO `kindarticle` VALUES ('110', 'life', '1');
INSERT INTO `kindarticle` VALUES ('111', 'life', '1');
INSERT INTO `kindarticle` VALUES ('112', 'life', '1');
INSERT INTO `kindarticle` VALUES ('113', 'life', '1');
INSERT INTO `kindarticle` VALUES ('114', 'life', '1');
INSERT INTO `kindarticle` VALUES ('115', 'life', '1');
INSERT INTO `kindarticle` VALUES ('116', 'life', '1');
INSERT INTO `kindarticle` VALUES ('117', 'life', '1');
INSERT INTO `kindarticle` VALUES ('118', 'life', '1');
INSERT INTO `kindarticle` VALUES ('119', 'life', '1');
INSERT INTO `kindarticle` VALUES ('120', 'life', '1');
INSERT INTO `kindarticle` VALUES ('121', 'life', '1');
INSERT INTO `kindarticle` VALUES ('122', 'life', '1');
INSERT INTO `kindarticle` VALUES ('123', 'life', '1');
INSERT INTO `kindarticle` VALUES ('124', 'life', '1');
INSERT INTO `kindarticle` VALUES ('125', 'life', '1');
INSERT INTO `kindarticle` VALUES ('126', 'life', '1');
INSERT INTO `kindarticle` VALUES ('127', 'life', '1');
INSERT INTO `kindarticle` VALUES ('128', 'life', '1');
INSERT INTO `kindarticle` VALUES ('129', 'life', '1');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) DEFAULT NULL,
  `user_name` varchar(12) DEFAULT NULL,
  `password` varchar(12) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (null, 'jin', '1', 'man');
INSERT INTO `person` VALUES (null, 'yu', '2', 'man');
INSERT INTO `person` VALUES (null, 'yuun', '3', 'man');
INSERT INTO `person` VALUES (null, 'bao', '4', 'man');
INSERT INTO `person` VALUES (null, 'baa', '5', 'man');

-- ----------------------------
-- Table structure for user_tbl
-- ----------------------------
DROP TABLE IF EXISTS `user_tbl`;
CREATE TABLE `user_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(17) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nickname` varchar(16) DEFAULT NULL,
  `question` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_tbl
-- ----------------------------
INSERT INTO `user_tbl` VALUES ('1', '13971501571', '19jy26', '曙光', '女朋友', '高贝');
INSERT INTO `user_tbl` VALUES ('2', '1', '1', '1', '1', '1');
INSERT INTO `user_tbl` VALUES ('19', '3', '3', '3', '3', '3');
INSERT INTO `user_tbl` VALUES ('20', '2', '2', '2', '2', '2');
INSERT INTO `user_tbl` VALUES ('21', '1345551624', '193426', '高贝', '老公', '金玉宝');
INSERT INTO `user_tbl` VALUES ('22', '5', '5', '5', '5', '5');
INSERT INTO `user_tbl` VALUES ('23', '22', '22', '22', '22', '22');
INSERT INTO `user_tbl` VALUES ('24', '33', '33', '33', '33', '33');
INSERT INTO `user_tbl` VALUES ('25', '32', '1', '1', '1', '1');
INSERT INTO `user_tbl` VALUES ('27', '1345551624@qq.com', '123456', '1', '1', '1');
INSERT INTO `user_tbl` VALUES ('28', '1345551622@qq.com', '1934jy26', '1', '1', '1');
