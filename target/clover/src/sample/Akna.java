/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import java.util.ArrayList;

/**
 * Makes the given number of bombs.
 */

public class Akna implements mezo{public static class __CLR4_3_1l5l5jvmsb1a5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557777169899L,8589935092L,820,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ArrayList<Integer>list = new ArrayList<Integer>();
    private double NumberOfBombs=3.0;

    /**
     * Places the number of bombs that given by @NumberOfBombs, than counts the bombs in the neighbours.
     */

    public void akn\u00e1k() {try{__CLR4_3_1l5l5jvmsb1a5.R.inc(761);
        __CLR4_3_1l5l5jvmsb1a5.R.inc(762);for (int i = 0; (((i < counter[0].length)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(763)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(764)==0&false)); i++) {{
            __CLR4_3_1l5l5jvmsb1a5.R.inc(765);for (int j = 0; (((j < counter.length)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(766)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(767)==0&false)); j++) {{
                __CLR4_3_1l5l5jvmsb1a5.R.inc(768);list.add(i * 100 + j);
            }
        }}


        }__CLR4_3_1l5l5jvmsb1a5.R.inc(769);for (int i = 0; (((i < NumberOfBombs)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(770)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(771)==0&false)); i++) {{
            __CLR4_3_1l5l5jvmsb1a5.R.inc(772);int bomb = (int) (Math.random() * list.size());
            __CLR4_3_1l5l5jvmsb1a5.R.inc(773);counter[list.get(bomb) / 100][list.get(bomb) % 100] = BOMB;
            __CLR4_3_1l5l5jvmsb1a5.R.inc(774);list.remove(bomb);


        }
        }__CLR4_3_1l5l5jvmsb1a5.R.inc(775);for (int i = 0; (((i < counter[0].length)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(776)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(777)==0&false)); i++) {{
            __CLR4_3_1l5l5jvmsb1a5.R.inc(778);for (int j = 0; (((j < counter.length)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(779)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(780)==0&false)); j++) {{
                __CLR4_3_1l5l5jvmsb1a5.R.inc(781);if ((((counter[i][j] != BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(782)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(783)==0&false))) {{
                    __CLR4_3_1l5l5jvmsb1a5.R.inc(784);int szomszed = 0;
                    __CLR4_3_1l5l5jvmsb1a5.R.inc(785);if ((((i > 0 && j > 0 && counter[i - 1][j - 1] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(786)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(787)==0&false)))                                    //bal fels\u0151
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(788);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(789);if ((((j > 0 && counter[i][j - 1] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(790)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(791)==0&false)))                                             //fels\u0151
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(792);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(793);if ((((i > 0 && counter[i - 1][j] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(794)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(795)==0&false)))                                             //bal
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(796);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(797);if ((((j < counter.length - 1 && counter[i][j + 1] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(798)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(799)==0&false)))                              //als\u00f3
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(800);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(801);if ((((i < counter[0].length - 1 && counter[i + 1][j] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(802)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(803)==0&false)))                           //jobb
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(804);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(805);if ((((i < counter[0].length - 1 && j < counter.length - 1 && counter[i + 1][j + 1] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(806)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(807)==0&false)))   //jobb fels\u0151
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(808);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(809);if ((((i > 0 && j < counter.length - 1 && counter[i - 1][j + 1] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(810)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(811)==0&false)))                     //bal als\u00f3
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(812);szomszed++;
                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(813);if ((((i < counter[0].length - 1 && j > 0 && counter[i + 1][j - 1] == BOMB)&&(__CLR4_3_1l5l5jvmsb1a5.R.iget(814)!=0|true))||(__CLR4_3_1l5l5jvmsb1a5.R.iget(815)==0&false)))                  //jobb als\u00f3
                        {__CLR4_3_1l5l5jvmsb1a5.R.inc(816);szomszed++;

                    }__CLR4_3_1l5l5jvmsb1a5.R.inc(817);counter[i][j] = szomszed;
                }
            }}
        }}
    }}finally{__CLR4_3_1l5l5jvmsb1a5.R.flushNeeded();}}

    /**
     *
     * @return gives the number of bombs.
     */
    public double getNumberOfBombs() {try{__CLR4_3_1l5l5jvmsb1a5.R.inc(818);
        __CLR4_3_1l5l5jvmsb1a5.R.inc(819);return NumberOfBombs;
    }finally{__CLR4_3_1l5l5jvmsb1a5.R.flushNeeded();}}
}

