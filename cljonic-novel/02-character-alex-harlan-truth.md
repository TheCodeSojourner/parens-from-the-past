# My life
I am 70 years old, and live in Idaho near Yellowstone National Park.  

I had a German grandfather, and I am fond of Germany and Frankfurt. 

I have a bachelor of science degree in mechanical engineering that I received in 1979 from the California State Polytechnic University in Pomona California.

My first introduction to programming was the one FORTRAN class I took in college using punch cards on a mainframe computer. A very indirect and inefficient way of interacting with a computer.

In 1979, my senior project was an HP Basic program running on a 1970s HP desktop computer that calculated isotherms for a 2D 
space, and drew the 2D space and the isotherms using the attached pen plotter. Developing this HP Basic program was far more interactive, hence far more efficient. It was at this time that it first dawned on me that humans learn by trial-and-error, and that the more interactive a programming environment is the faster the programmer can learn what a program is supposed to do and make it do it properly.  This was the first time I experienced the power of what LISP programmers call a REPL, a read-evaluate-print-loop.

At my first job, a major international company, I was able to take internal computer programming classes in the APL programming language, which amounted to a bachelor of science minor in computer science.  APL is a concise, symbolic programming language designed for interactive, mathematical thinking, expressing complex array operations with simple, elegant notation. At the time, APL, which ran on a mainframe computer interacting with a teletypewriter, was referred to as having an interactive computing environment. When programming in APL the programmer was said to be having a dialog with the computer. This was the second time I experienced the power of what LISP programmers call a REPL, a read-evaluate-print-loop.

One of my tasks at my first job was implementing the embedded control program for a manufacturing machine that was controlled by an IBM Series/1 minicomputer. Another task was implementing the same kind of control program on a Zilog Z80-based single board computer.  

While discussing how to implement these control programs with a coworker named Dave, my coworker suggested that I purchase the BYTE Book titled "Threaded Interpretive Languages", use it as a guide for implementing a FORTH system in assembler on both 
the Zilog Z80 single board computer and the IBM Series/1 minicomputer, and write the control programs in the FORTH systems I had implemented.

My coworker, Dave, was an astrophysicist that had worked on a Digital Equipment Corporation PDP-11 control program for the multiple mirror telescope located on Mount Hopkins in the Santa Rita Mountains outside of Tucson Arizona. The multiple
mirror telescope control program had been written in the FORTH programming language invented by Charles H. "Chuck" Moore.

Later my astrophysicist coworker, Dave, and I implemented a meta-FORTH system on a Sage Computer Technology motorola 68000 based mini computer, which ended up being ported to an IBM PC. A meta-FORTH system is a FORTH system that runs on a host 
computer, is implemented in the assembly language of the host system, and is designed to write FORTH systems for other computers, so called target systems, by first writing an assembler in the meta-FORTH system for the target system then
implementing a FORTH nucleus in that target assembler and finally porting the FORTH kernel, written in the FORTH nucleus to the target system.

My astrophysicist coworker, Dave, and I eventually used our meta-FORTH system to write a Unix-like operating system for both the IBM PC, and the Amiga personal computer.

In my next job, working for a startup company in Tucson Arizona, I used the meta-FORTH system to write embedded control software for a series of instrumentation and control hardware that plugged into the original IBM PC, and other compatible 
computer systems. 

The amazing thing about FORTH is that it, too, was described as a system that allows the programmer to have a dialogue with the machine.  This was the third time I experienced the power of what LISP programmers call a REPL, a read-evaluate-print-loop.

From there, I moved on to work for the prime contractor of the United States Department of Energy Nuclear research and 
development laboratory in Idaho Falls Idaho called the Idaho National Laboratory, or INL.  At the INL, I worked on a 
high-performance embedded relational database called Sage with a team of Modula-2 and Ada programmers. The original Sage 
project was written in the Modula-2 programming language, which is an industrial strength successor to Pascal also 
invented by Niklaus Wirth.  Modula-2 was chosen over FORTRAN, which was well known by the original Save developers, 
because of its superior modularity and strong-typing characteristics.  Later, the United States Marine Corp, which had 
been mandated to adopt the Ada programming language created by the United States Department of Defense, now called the 
United States Department of War, provided funding to translate Sage from Modula-2 into Ada.  The Sage team made the 
decision to move forward by continuing to develop Sage in Modula-2 and Ada at the same time.  None of these languages (i.e., MODULA-2, PASCAL or Ada were interactive, they did not have REPLs).

My next job was at a startup company that was founded by me, some of my fellow Sage programmers from the INL, and one of 
our United States Navy service members that had used Sage while in the Navy.  Our startup company was trying to license 
Sage, now commercially renamed NitroDB, for use by commercial and government entities. Finding it nearly impossible to
generate interest in NitroDB, we embedded NitroDB in a cyber security appliance product line, acquired venture capital, 
and renamed the company NitroSecurity. Eventually, NitroSecurity was acquired by the McAfee company, which had been
acquired earlier by the Intel Corporation and remained a wholly owned subsidiary of Intel. It was at McAfee where I 
first encountered and started using Clojure to analyze cyber security data, and develop tooling for the product software
develop team.  One of Clojure's most powerful features is its REPL, which comes from its roots as a LISP. This was the fourth time I experienced the power of what LISP programmers call a REPL, a read-evaluate-print-loop.

After a few years working at McAfee, Intel decided to integrate McAfee directly into Intel, creating the Intel
Security Group. In short order I was able to attain the rather rare distinction of becoming an Intel 
"Principle Engineer".  Also in short order Intel decided to lay off 11% of there global workforce, some 12,000 
employees, including me.  I was offered an attractive retirement package, and I accepted it. 

At the time of the lay off, I was only 60 years old, still loved programming, especially in Clojure, working with software developers and did not want to
retire. Quite quickly I found a job at an original equipment manufacturing (OEM) company in Rice Lake Wisconsin that 
manufactured weighing system equipment, like load-cell-based scales, scale platforms and scale indicators that used custom-designed electronic printed circuit boards with microcontroller units (MCU). A surprise to me, was that the 
typical scale indicator source code base was composed of around one hundred thousand lines of C++ code.  It turned out 
that scale indicators, in order to meet the regulatory compliance requirements of legal-for-trade weight indicators 
and function as industrial process controllers, are rather complicated devices.  Having started out doing embedded 
control systems, I now found myself back in the embedded space again, but now with some Clojure experience and an 
intuition that the Clojure mindset could benefit embedded systems developers.  

Ten years later, and now 70 years old, I'm still loving programming, especially in Clojure, and find myself inspired to 
create, hopefully with a small team of Clojure and modern C++ developers, a Clojure-like modern c++ library for embedded 
software developers that cannot use either the heap or exceptions.

Shortly after graduating from college, I got married, and moved to Tucson Arizona for my first job.  Ten years later
my wife and I moved to Idaho Falls Idaho, and had two children.  We now have five grand children, and one more in my
son's wife's womb.

Until I was 40 years old I was a hard atheist. I firmly believed that God did not exist. Unlike an agnostic or a soft 
atheist, who may simply lack belief in God, I made a positive claim that God does not exist and grounded this 
conviction, I thought, in reason, evidence, and scientific understanding. I rejected the concept of the supernatural 
as a human construct rather than a reflection of reality. 

Around the time I turned 30 years of age, at a dinner party hosted by the pastor of the evangelical church my wife 
attended, my wife was a Christian, my wife's pastor, knowing that I was a hard atheist, suggested that, in fact, there
was evidence for God and Jesus Christ, and that I should seriously investigate this evidence given the fact that if 
the Christian God and Jesus Christ did exist my eternal soul was on the line.  Wishing to prove my wife's pastor wrong,
I started, initially not very enthusiastically, to investigate the evidence for the Christian God and Jesus Christ.

My investigation uncovered scientific and philosophical evidence for the Christian God and Jesus Christ.  Compared to
the, so called, scientific evidence that there is no God, the evidence I uncovered eventually satisfied my mind, and I
accepted the Gospel of Jesus Christ, and the Bible, as the basis for the true reality of the Universe and everything and
everyone that has ever existed, exists now, or ever will exist. 

Now, at 70, I study the Bible, teach Bible studies, and teach classes on Christian Apologetics.

Unfortunately, I find that most Christians do not understand the evidence for God, Jesus and the Bible, or do not know how to effectively present the evidence.  Furthermore, I find that most non-Christians do not realize that they too have a faith-based worldview (e.g., faith in science, faith in right and wrong), and do have a grossly erroneous understanding of the teachings of Jesus Christ. 
