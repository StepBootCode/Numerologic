package com.stepchenkov.numerologic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.res.AssetManager;
import android.text.format.DateUtils;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.DatePicker;


import android.text.format.DateUtils;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int myYear = 2000;
    int myMonth = 01;
    int myDay = 01;

    WebView webview;

    @Override
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview=(WebView)findViewById(R.id.webView);
        setInitialDateTime();
    }

    // установка начальных даты и времени
    private void setInitialDateTime() {

        String summary = "<html><body>"+
                "<br />" +
                "<br />" +
                "<br />" +
                "<img src=\"file:///android_asset/logo.png\">"+
                "<br />" +
                "«Если есть в мире законы, которым повинуется все на свете, "+
                "и люди и боги, - то это, прежде всего законы математические. "+
                "Кто знает математику, тот знает то, что выше богов»"+
                "<br />" +
                "<p align=\"right\"><b>Пифагор.</b></p>"+
                "</body></html>";


        //webview.loadUrl("file:///android_asset/logo.png");

        webview.loadData(summary, "text/html; charset=utf-8", "utf-8");
       // currentDateTime.setText(DateUtils.formatDateTime(this,
       //         dateAndTime.getTimeInMillis(),
       //         DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
       //                 | DateUtils.FORMAT_SHOW_TIME));
    }

    // установка начальных даты и времени
    private void setInfoDateTime() {

        int i = 0;
        
        int[] numbers = new int[10];
        for (i=0; i<10; i++) {
            numbers[i]=0;
        }

        int d1=0; int d2=0; int m1=0; int m2=0; int y1=0; int y2=0; int y3=0; int y4=0;
        int x1=0; int x2=0; int x3=0; int x4=0;
        int d=0; int m=0; int y=0;
        int z1=0; int z2=0; int z3=0; int z4=0;

        String temp="";
        String charact="";

        int myYear = 2000;
        int myMonth = 01;
        int myDay = 01;

        d   =   myDay;
        m   =   myMonth;
        y   =   myYear;


        temp=String.valueOf(d);
        temp.length();
        for (i=1; i < temp.length(); i++) do {
            switch (i) {
                case 1:d1 = strtointdef(temp[i], 0);
                case 2:d2 = strtointdef(temp[i], 0);
                default: d1 = strtointdef(temp[i], 0);
            }
        }

        temp=inttostr(m);
        for i=1 to length(temp) do
            begin
        case i of
        1: m1= strtointdef(temp[i],0);
        2: m2= strtointdef(temp[i],0);
    else m1= strtointdef(temp[i],0);
        end;
        end;

        temp=inttostr(y);
        for i=1 to length(temp) do
            begin
        case i of
        1: y1= strtointdef(temp[i],0);
        2: y2= strtointdef(temp[i],0);
        3: y3= strtointdef(temp[i],0);
        4: y4= strtointdef(temp[i],0);
    else y1= strtointdef(temp[i],0);
        end;
        end;

        x1=d1+d2+m1+m2+y1+y2+y3+y4;
        x2= (x1 div 10) + (x1 mod 10);
        x3= x1 - y1*2;
        x4= (x1 div 10) + (x1 mod 10);


        numbers[d1]=numbers[d1]+1;
        numbers[d2]=numbers[d2]+1;
        numbers[m1]=numbers[m1]+1;
        numbers[m2]=numbers[m2]+1;
        numbers[y1]=numbers[y1]+1;
        numbers[y2]=numbers[y2]+1;
        numbers[y3]=numbers[y3]+1;
        numbers[y4]=numbers[y4]+1;

        numbers[(x1 div 10)]=numbers[(x1 div 10)]+1;
        numbers[(x1 mod 10)]=numbers[(x1 mod 10)]+1;

        numbers[(x2 div 10)]=numbers[(x2 div 10)]+1;
        numbers[(x2 mod 10)]=numbers[(x2 mod 10)]+1;

        numbers[(x3 div 10)]=numbers[(x3 div 10)]+1;
        numbers[(x3 mod 10)]=numbers[(x3 mod 10)]+1;

        numbers[(x4 div 10)]=numbers[(x4 div 10)]+1;
        numbers[(x4 mod 10)]=numbers[(x4 mod 10)]+1;

//if Lang1.Lang = 'RU' then
        begin
        charact='Характер: ';
        case numbers[1] of
        0,1: charact=charact+'О чловеке можно сказать — утонченный эгоист. Не обращая ни на что вокруг внимания, он стремится из любого положения извлечь максимальную выгоду прежде всего для себя. '+'Его мало интересуют другие люди и то — чем и как они живут. Главное, что живет и должен жить только он один.' ;
        2: charact=charact+'У человека присутствует слабо выраженный эгоизм (все время себя хвалит, как на продажу, боится переоценить).' ;
        3: charact=charact+'Человек обладает хорошим характером, покладистым. Таких людей достаточно трудно вывести из себя, с ними всегда можно найти общий язык.' ;
        4: charact=charact+'Человек сильного характера, волевой. Не терпит подхалимажа и лжи, хотя иногда, сцепив зубы, может пойти и на это ради близких людей. '+'Мужчины с таким характером подходят на роль профессиональных военных, женщины обычно держат в кулаке свою семью.' ;
        5: charact=charact+'Человек — диктатор, самодур. Ради своей идеи или прихоти может пустить на ветер миллионы — или человеческих жизней, или денег. '+'Для достижения своей цели идет, что называется, "по трупам", '+'не оглядываясь и не останавливаясь. Если у него нет возможности ощутить свою значительность, может стать тираном в семье, отшельником или приобрести какие-нибудь психические расстройства. '+'Настойчив в намерениях, в мести, хорошо приспосабливается. Часто преследуем какой-то серьезной манией. '+'Привязчив к своим детям или внукам. Конкретен — старается все продумать заранее.' ;
    else charact=charact+'Человек обычно жесткий, жестокий, но для близких или "на благо человечества" способен совершить невозможное. Люди очень незаурядные, нередко попадающие под влияние какой-то одной идеи. С ними тяжело общаться, трудно конкурировать. ' ;
        end;

        charact=charact+#10#13+'Хозяйственность, порядочность: ';
        case numbers[3] of  // Третий квадрат расскажет о степени порядочности.
        0: charact=charact+'Обычно очень чистоплотные или пунктуальные люди; что-то выделяет их из окружающей среды — они постоянно что-то чистят, трут; женщины  — отличные хозяйки, но несколько раздражают своим стремлением к чистоте; '+'мужчины тщательно следят за своим внешним видом и не терпят, когда их подруги опаздывают на свидания. Детей воспитывают в строгости. Любят наблюдать себя в зеркале, произносить умные, витиеватые фразы. Кропотливый труд выполняют безукоризненно.' ;
        1: charact=charact+'Этих людей не беспокоит порядок, все зависит от настроения, "хочу делаю, хочу нет".' ;
        2: charact=charact+'Явно выражена склонность к наукам. Аналитический склад ума. Хорошие математики, физики, химики, ученые.' ;
        3: charact=charact+'Усиленная склонность к наукам; если она не реализуется, то порождает невозможную педантичность, скупость, наклонность к постоянному восстановлению справедливости.' ;
    else charact=charact+'Большие спосоности, появляется не желание развиваться. ' ;
        end;

        charact=charact+#10#13+'Ответственность: ';
        case numbers[8] of  // Количество восьмерок указывает на степень ответственности.
        0: charact=charact+'Соответствует почти полному отсутствию чувства долга. Человек никогда не считает себя кому-то обязанным, не спешит отдавать взятое и пропускает все назначенные сроки. ' ;
        1: charact=charact+'Можно сказать, что эти люди наделены тем, что называется чувством долга: они ответственны, добросовестны, точны в делах. ' ;
        2: charact=charact+ 'Очень развито чувство долга. Этих людей всегда отличает желание помочь другим, особенно слабым, больным, одиноким. Считают себя ответственными за кого-либо или что-либо. Обычно прекрасные семьянины. ' ;
        3: charact=charact+ 'Служение народу! Такие люди или возглавляют нации, чтобы вести их путем избранных, или, оставаясь в тени, не жалея себя и не щадя сил, работают на их благо. В любом случае правитель с тремя восьмерками добивается выдающихся результатов. ' ;
    else charact=charact+'Дети с этим знаком рождаются с парапсихологическими способностями и исключительной восприимчивостью к точным наукам. Им открыты сверхъестественные пути.' ;
        end;

        charact=charact+#10#13+'Интеллект: ';
        case numbers[9] of  // Девятый квадрат указывает на уровень развития умственных способностей.
        0: charact=charact+'Человек от рождения не блестит умом, ему необходимо умственно развиваться, много и усердно учиться, но это ему дается не просто. ';
        1: charact=charact+'Человек должен упорно трудиться, чтобы развить свой интеллект. ';
        2: charact=charact+ 'У человека с рождения умная голова. Они должны учиться, т.к. многого могут добиться. ' ;
        3: charact=charact+ 'Очень умны от природы, слабо учится, т.к. все дается. В учении вообще не прилагают никаких усилий: все, что требует от них каких-либо умственных затрат, не представляет для них затруднений. ' ;
    else charact=charact+'Этим людям открывается истина. Если при этом развита интуиция, то они гарантированы от провала в любом из своих начинаний. При всем этом они, как правило, довольно неприятны, так как резкий ум делает их грубыми, немилосердными и жестокими. '+'Сострадания от них ждать не приходится. Не имеет никакого смысла тратить усилия на то, чтобы они переменили свое мнение. Зачастую откровенно презрительны. ' ;
        end;

        charact=charact+#10#13+'Талант: ';
        case numbers[7] of  // Количество цифр в седьмом квадрате расскажет о таланте.
        0: charact=charact+'Этот человек родился, чтобы развивать талант, а достичь этого может только большими стараниями. Очень тяжелая жизнь. Почти всегда приведет к религии. ' ;
        1: charact=charact+'Божья искра. Таким людям живется значительно легче, есть талант, но неярко выражен. ' ;
        2: charact=charact+ 'Человек очень одаренный, музыкальный, имеет художественный вкус, сможет рисовать. Если характер эгоистичен, то его эгоизм может руководить им и его талантом. Такой человек ходит по лезвию бритвы, ему удается все, хорошее и плохое. '+'Для него нет закрытых дверей. Если он будет судиться, то ему обязательно помогут выиграть процесс или вытащить из ямы. С детства нужно учиться альтруизму. ' ;
        3: charact=charact+ 'Обладает знаком особого человека – ангела. Эти люди, как правило, приходят на землю ненадолго, а если же пришли с жизненными достатками, то их ждет в старости паралич. ' ;
    else charact=charact+'Знак Ангела. Люди с таким знаком умирают в младенчестве, а если остаются жить, то их жизни постоянно угрожает опасность или катастрофа. ' ;
        end;

        charact=charact+#10#13+'Приземленность, логика, расчетливость: ';
        case numbers[6] of  // Шестой квадрат указывает на степень приземленности человека,
        0: charact=charact+'Такой человек пришел на землю приобрести ремесло, физический труд необходим, но он его не любит. ' ;
        1: charact=charact+'Человек в какой-то мере заземлен, можно заниматься творчеством или точными науками, но физический труд является обязательным условием существования. ' ;
        2: charact=charact+ 'Человек очень заземлен. Эти люди тянутся к физическому труду, хотя как раз для них он не обязателен.' ;
        3: charact=charact+ 'Согласно Библии обладает знаком Сатаны. Люди повышенного темперамента, обаятельные, неизменно становящиеся в обществе центром внимания. Партнер, на ком женат, должен быть с большим количеством биоэнергии, т.к. '+'он подпитывается от своего партнера и часто, насосав энергию уходит к другому партнеру.' ;
    else charact=charact+'Этот человек в своих предыдущих воплощениях набрал много заземленности, он очень много трудится. Для него не существует тяжести труда (физического), он всегда трудится. Обязательно нужен институт, если обладает интеллектом. ' ;
        end;

        charact=charact+#10#13+'Здоровье, сексуальность: ';
        case numbers[4] of  // Четвертый квадрат говорит о здоровье.
        0: charact=charact+'Здоровье очень слабое, человек с детства подвержен различным заболеваниям; болеть будет тем больше, чем больше у него биоэнергии, потому что так или иначе будет вынужден отдавать свою энергию. ' ;
        1: charact=charact+'Здоровье среднее, необходимо закалять организм; болезни подступают к старости. ' ;
        2: charact=charact+ 'От природы это очень крепкий человек с повышенным темпераментом. ' ;
    else charact=charact+'Люди с очень крепким здоровьем и огромными сексуальными возможностями. Мужчины — от природы очень сильные физически. ' ;
        end;

        charact=charact+#10#13+'Интуиция: ';
        case numbers[5] of   //Пятый квадрат свидетельствует о развитии интуиции.
        0: charact=charact+'Открытый канал при рождении, поэтому этот человек всегда пытается что-то предпринять, что-то доказать, всегда голова в раздумье, сам в эксперименте, в расчете. '+'Жизненный опыт показывает, что с этим человеком трудно жить. Все достается (пробивает) своей головой. ' ;
        1: charact=charact+'Канал связи открыт. Эти люди совершают гораздо меньшее число ошибок и в жизни и вообще, могут правильно рассчитать ситуацию и извлечь из нее максимальную пользу. ' ;
        2: charact=charact+'Сильно развитая интуиция. Могут предугадывать ход событий. Самые подходящие для них профессии: юрист, следователь. ' ;
        3: charact=charact+'Почти ясновидящие. Такие люди всегда знают, как действовать в той или иной ситуации, поэтому практически не допускают ошибок. В ряде случаев точно предсказывают предстоящие события. ' ;
    else charact=charact+'Ясновидящие. Все, что вокруг происходит, им совершенно ясно. В их жизни бывают моменты, когда они находятся вне времени и пространства. '+'Личности, при полной реализации своих способностей выходящие за рамки обычного человеческого.' ;
        end;

        charact=charact+#10#13+'Биоэнергетика, страстность: ';
        case numbers[2] of
        0,1: charact=charact+'Обычные в биоэнергетическом отношении люди. Все же биоэнергии маловато. Эти люди должны избегать стрессовых ситуаций, слишком сильных эмоций, '+'обязательны занятия физкультурой или спортом, эффективнее же всего — йога. Такие люди очень чувствительны к изменениям в атмосфере. ' ;
        2: charact=charact+'Присутствует достаточное количество биоэнергии, способен делится энергией с другими, может стать целителем. В семье таких людей в принципе редко у кого бывают нервные стрессы, '+'если, конечно, взаимоотношения не осложнены какими-то особыми обстоятельствами. ' ;
        3: charact=charact+'Знак экстрасенса. Возможно, что человек сам не подозревает о своих способностях, но такие люди наиболее приспособлены к тому, чтобы лечить своим биополем. '+'Для развития своих способностей им достаточно лишь небольшого толчка. ' ;
    else charact=charact+'Если вы когда-нибудь встречали женщину, в которую влюблены все без исключения мужчины, или мужчину, неотразимого для всех женщин, то вы наверняка убедитесь в наличии у них сильной биоэнергии. Этих людей очень любит противоположный пол. '+'Однако этим людям с высокой биоэнергетикой следует поостеречься: именно на них безошибочно выходят те, кто имеет "знак сатаны" — они черпают в них энергию, подпитываются ею, буквально выкачивают ее.' ;
        end;
        end;



        String summary = "<html><body>"+
                "<br />" +
                "<br />" +
                "<br />" +
                "<img src=\"file:///android_asset/logo.png\">"+
                "<br />" +
                "«Если есть в мире законы, которым повинуется все на свете, "+
                "и люди и боги, - то это, прежде всего законы математические. "+
                "Кто знает математику, тот знает то, что выше богов»"+
                "<br />" +
                "<p align=\"right\"><b>Пифагор.</b></p>"+
                "</body></html>";


        //webview.loadUrl("file:///android_asset/logo.png");

        webview.loadData(summary, "text/html; charset=utf-8", "utf-8");
        // currentDateTime.setText(DateUtils.formatDateTime(this,
        //         dateAndTime.getTimeInMillis(),
        //         DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
        //                 | DateUtils.FORMAT_SHOW_TIME));
    }

    // обработка нажатия кнопки
    public void setDate(View v) {
        new DatePickerDialog(MainActivity.this, dsl, myYear, myMonth, myDay).show();
    }

    // установка обработчика выбора даты
    DatePickerDialog.OnDateSetListener dsl=new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            myYear = year;
            myMonth = monthOfYear;
            myDay = dayOfMonth;
            setInfoDateTime();
        }
    };
}
