package day15.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
         hero.setName("马云");//设置英雄名称
        //设置英雄技能
//        hero.setSkill(new SkillImpl());//使用单独定义的实现类

        //还可以使用内明内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("钞能力2");
//            }
//        };
//        hero.setSkill(skill);

        //进一步简化。同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("钞能力3");
            }
        });
        hero.attact();
    }
}
