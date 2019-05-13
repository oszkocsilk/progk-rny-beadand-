/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

/**
 * This watches the mouse click, runs the timer, count disabled buttons, watches if you win or lost.
 */
@Slf4j
public class Controller implements mezo {public static class __CLR4_3_1pcpcjvmtd92l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557778952978L,8589935092L,1002,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@code}timer counts the time.
     * {@code}score counts the score.
     * {@code}lose watches if you lose.
     * {@code}win watches if you win.
     * {@code}disables counts the disabled buttons.
     */
    public double timer=0.0;
    private Double score=0.0;
    private boolean lose=false;
    int disabled=0;
    private boolean win;


    private Akna akna=new Akna();
    private Aknakereso aknakereso;
    private BlowedUp b;
    private static EntityManager em;

    ArrayList<Integer> toClear = new ArrayList<Integer>();
    NullBlower nullBlower = new NullBlower();


    EventHandler<MouseEvent> eventHandler = new EventHandler<>() {
        /**
         *Watches the mouse click, if it is on a button.
         * @param event Event of the mouse click
         */
        @Override
        public void handle(MouseEvent event) {try{__CLR4_3_1pcpcjvmtd92l.R.inc(912);
            __CLR4_3_1pcpcjvmtd92l.R.inc(913);log.info("Waiting for mouse event");
            __CLR4_3_1pcpcjvmtd92l.R.inc(914);for (int i = 0; (((i < aknakereso.getMezo().length)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(915)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(916)==0&false)); i++) {{
                __CLR4_3_1pcpcjvmtd92l.R.inc(917);for (int j = 0; (((j < aknakereso.getMezo().length)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(918)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(919)==0&false)); j++) {{
                    __CLR4_3_1pcpcjvmtd92l.R.inc(920);if ((((event.getSource().equals(aknakereso.getMezo()[i][j]))&&(__CLR4_3_1pcpcjvmtd92l.R.iget(921)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(922)==0&false))) {{
                            __CLR4_3_1pcpcjvmtd92l.R.inc(923);log.info("Mouse click happened");
                            __CLR4_3_1pcpcjvmtd92l.R.inc(924);disabled++;
                        __CLR4_3_1pcpcjvmtd92l.R.inc(925);if ((((counter[i][j] != 666)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(926)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(927)==0&false))) {{

                            __CLR4_3_1pcpcjvmtd92l.R.inc(928);if ((((counter[i][j] == 0)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(929)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(930)==0&false))) {{
                                __CLR4_3_1pcpcjvmtd92l.R.inc(931);log.info("Zeros exploded.");
                                __CLR4_3_1pcpcjvmtd92l.R.inc(932);aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                __CLR4_3_1pcpcjvmtd92l.R.inc(933);aknakereso.getMezo()[i][j].setDisable(true);

                                __CLR4_3_1pcpcjvmtd92l.R.inc(934);toClear.add(i * 100 + j);
                                __CLR4_3_1pcpcjvmtd92l.R.inc(935);nullBlower.Blower(toClear);

                            } }else {{
                                __CLR4_3_1pcpcjvmtd92l.R.inc(936);log.info("Number selected");
                                __CLR4_3_1pcpcjvmtd92l.R.inc(937);aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                __CLR4_3_1pcpcjvmtd92l.R.inc(938);aknakereso.getMezo()[i][j].setDisable(true);
                            }
                            }__CLR4_3_1pcpcjvmtd92l.R.inc(939);disabled+=nullBlower.getDisabledCounter();
                            __CLR4_3_1pcpcjvmtd92l.R.inc(940);win();
                            __CLR4_3_1pcpcjvmtd92l.R.inc(941);nullBlower.setDisabledCounter(0);
                        } }else {{
                            __CLR4_3_1pcpcjvmtd92l.R.inc(942);log.info("You chose a BOMB");
                            __CLR4_3_1pcpcjvmtd92l.R.inc(943);b.Blowed();
                            __CLR4_3_1pcpcjvmtd92l.R.inc(944);b.display("LOSER","YOU LOST!");
                            __CLR4_3_1pcpcjvmtd92l.R.inc(945);lose=true;

                            }
                        }}
                    }}
                }}
            }}finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}
        };


    /**
     *Tests if you win or not.
     */

    public void win() {try{__CLR4_3_1pcpcjvmtd92l.R.inc(946);
        __CLR4_3_1pcpcjvmtd92l.R.inc(947);for (int i = 0; (((i < Aknakereso.counter[0].length)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(948)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(949)==0&false)); i++) {{
            __CLR4_3_1pcpcjvmtd92l.R.inc(950);for (int j = 0; (((j < Aknakereso.counter.length)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(951)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(952)==0&false)); j++) {{
                __CLR4_3_1pcpcjvmtd92l.R.inc(953);if ((((Aknakereso.counter[i][j] == BOMB && Aknakereso.mezo[i][j].isDisabled() == false)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(954)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(955)==0&false))) {{
                    __CLR4_3_1pcpcjvmtd92l.R.inc(956);win = false;
                }
                }else {__CLR4_3_1pcpcjvmtd92l.R.inc(957);if((((disabled==(all-akna.getNumberOfBombs()) )&&(__CLR4_3_1pcpcjvmtd92l.R.iget(958)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(959)==0&false))){{
                    __CLR4_3_1pcpcjvmtd92l.R.inc(960);win=true;
                    __CLR4_3_1pcpcjvmtd92l.R.inc(961);log.info("Game won, here are no available non-bomb button.");
                }
            }}}
        }}
    }}finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}

    /**
     *Starts the timer and tries to catch mouse event.
     * @param aknakereso calls the created aknakereso.
     */
    public Controller(Aknakereso aknakereso) {try{__CLR4_3_1pcpcjvmtd92l.R.inc(962);
        __CLR4_3_1pcpcjvmtd92l.R.inc(963);this.aknakereso = aknakereso;
        __CLR4_3_1pcpcjvmtd92l.R.inc(964);this.b = new BlowedUp(aknakereso);

        __CLR4_3_1pcpcjvmtd92l.R.inc(965);new AnimationTimer(){
            @Override
            public void handle(long l) {try{__CLR4_3_1pcpcjvmtd92l.R.inc(966);

                    __CLR4_3_1pcpcjvmtd92l.R.inc(967);timer++;

                __CLR4_3_1pcpcjvmtd92l.R.inc(968);if ((((win==true)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(969)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(970)==0&false))) {{

                    __CLR4_3_1pcpcjvmtd92l.R.inc(971);score = ( akna.getNumberOfBombs() * 1000 )   /   ( timer / 60 );
                    __CLR4_3_1pcpcjvmtd92l.R.inc(972);data(score);
                    __CLR4_3_1pcpcjvmtd92l.R.inc(973);System.out.println("score \u00e9rt\u00e9ke:"+getScore());
                    __CLR4_3_1pcpcjvmtd92l.R.inc(974);b.display("WIN", "YOU WIN!\nYour score is: "+score);
                    __CLR4_3_1pcpcjvmtd92l.R.inc(975);this.stop();



                }
                }__CLR4_3_1pcpcjvmtd92l.R.inc(976);if ((((lose==true)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(977)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(978)==0&false))) {{

                    __CLR4_3_1pcpcjvmtd92l.R.inc(979);this.stop();

                }
            }}finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}
        }.start();

        __CLR4_3_1pcpcjvmtd92l.R.inc(980);for (int i = 0; (((i < aknakereso.getMezo().length)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(981)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(982)==0&false)); i++) {{
            __CLR4_3_1pcpcjvmtd92l.R.inc(983);for (int j = 0; (((j < aknakereso.getMezo().length)&&(__CLR4_3_1pcpcjvmtd92l.R.iget(984)!=0|true))||(__CLR4_3_1pcpcjvmtd92l.R.iget(985)==0&false)); j++) {{
                __CLR4_3_1pcpcjvmtd92l.R.inc(986);aknakereso.getMezo()[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);
            }
        }}
    }}finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}

    /**
     *Make contact with the database, than pushes up te new data.
     * @param Score the score of the current player for uploading.
     */
    private void data(double Score){try{__CLR4_3_1pcpcjvmtd92l.R.inc(987);


            __CLR4_3_1pcpcjvmtd92l.R.inc(988);EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
            __CLR4_3_1pcpcjvmtd92l.R.inc(989);em = emf.createEntityManager();
            __CLR4_3_1pcpcjvmtd92l.R.inc(990);createPlayer(Score);
            __CLR4_3_1pcpcjvmtd92l.R.inc(991);em.close();
            __CLR4_3_1pcpcjvmtd92l.R.inc(992);emf.close();
        }finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}

    /**
     *Makes a new player, whith an ID and pushes up to the database.
     * @param Score the score of the current player.
     */
    private static void createPlayer(double Score) {try{__CLR4_3_1pcpcjvmtd92l.R.inc(993);
        __CLR4_3_1pcpcjvmtd92l.R.inc(994);em.getTransaction().begin();
        __CLR4_3_1pcpcjvmtd92l.R.inc(995);Player emp = new Player(Score);
        __CLR4_3_1pcpcjvmtd92l.R.inc(996);em.persist(emp);
        __CLR4_3_1pcpcjvmtd92l.R.inc(997);em.getTransaction().commit();
    }finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}

    /**
     *
     * @return gives back the score
     */
    public double getScore() {try{__CLR4_3_1pcpcjvmtd92l.R.inc(998);
        __CLR4_3_1pcpcjvmtd92l.R.inc(999);return score;
    }finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}

    /**
     *
     * @return gives back the value of Disabled buttons.
     */

    public int getDisabled() {try{__CLR4_3_1pcpcjvmtd92l.R.inc(1000);
        __CLR4_3_1pcpcjvmtd92l.R.inc(1001);return disabled;
    }finally{__CLR4_3_1pcpcjvmtd92l.R.flushNeeded();}}
}