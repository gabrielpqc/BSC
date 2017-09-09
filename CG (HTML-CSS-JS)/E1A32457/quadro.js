
			function main () {
                 
				var canvas=document.getElementById("trabalho");
				var context=canvas.getContext("2d");
				
                
            //background
                context.fillStyle="#F8F0E5";
                context.fillRect(0,0,640,493);
            
            //Circulo N
                context.beginPath();
                context.moveTo(302,159);
                context.lineTo(302,128);
                context.lineTo(332,91);
                context.lineTo(351,93);
                context.fillStyle = '#687CC1';
                context.fill();

                context.save();
                context.translate(332,125);
                context.beginPath();
                context.moveTo(0,0);
                context.lineTo(13,27);
                context.lineTo(0,25);
                context.restore();
                context.fillStyle = '#384884';
                context.fill();
                
                context.save();
                context.translate(357,131);
                context.scale(0.9,0.9);
                context.beginPath();
                context.moveTo(0,0);
                context.lineTo(13,27);
                context.lineTo(0,25);
                context.restore();
                context.fillStyle = '#384884';
                context.fill();
                
                context.save();
                context.translate(343,98);
                context.beginPath();
                context.moveTo(0,0);
                context.lineTo(13,27);
                context.lineTo(0,25);
                context.restore();
                context.fillStyle = '#384884';
                context.fill();
                
                context.beginPath();
                context.moveTo(317,100);
                context.lineTo(331,91);
                context.lineTo(332,119);
                context.lineTo(317,116);
                context.moveTo(305,122);
                context.lineTo(317,125);
                context.lineTo(317,148);
                context.lineTo(306,146);
                context.moveTo(305,172);
                context.lineTo(317,190);
                context.lineTo(317,173);
                context.lineTo(317,150);
                context.lineTo(331,152);
                context.lineTo(332,175);
                context.lineTo(317,172);
                context.lineTo(345,178);
                context.lineTo(346,198);
                context.lineTo(332,198);
                context.lineTo(332,175);
                context.moveTo(359,190);
                context.lineTo(347,198);
                context.lineTo(359,176);
                context.moveTo(359,176);
                context.lineTo(346,155);
                context.lineTo(346,175);
                context.lineTo(366,178);
                context.lineTo(367,163);
                context.lineTo(359,174);
                context.moveTo(358,125);
                context.lineTo(366,112);
                context.lineTo(372,127);     
                context.fillStyle = '#384884';
                context.fill();
                
                context.beginPath();
                context.moveTo(317,173);
                context.lineTo(317,189);
                context.lineTo(330,174);
                context.moveTo(331,172);
                context.lineTo(331,153);
                context.lineTo(343,154);
                context.moveTo(346,155);
                context.lineTo(358,177);
                context.lineTo(369,159);
                context.moveTo(332,126);
                context.lineTo(345,152);
                context.lineTo(357,131);
                context.fillStyle = '#C53618';
                context.fill();
                
                context.save();
                context.translate(337,145);
                context.scale(1.2, 1.8);
                context.beginPath();
                context.arc(0,0, 30, 0, 2 * Math.PI, false);
                context.restore();

                context.lineWidth = 3;
                context.strokeStyle = '#3D4D81';
                context.stroke();
                
                
            //SemiCirculo N
                context.save();
                context.translate(460,145);
                context.scale(1.2, 1.2);
                context.beginPath();
                context.arc(0,0, 30, 0, 1.5 * Math.PI, true);
                context.restore();
                context.lineWidth = 3;
                context.strokeStyle = 'black';
                context.stroke();
                
                context.save();
                context.translate(460,145);
                context.scale(1.2, 1.2);
                context.beginPath();
                context.arc(0,0, 30, 0, 0.5 * Math.PI, false);
                context.restore();
                context.lineWidth = 3;
                context.strokeStyle = 'black';
                context.stroke();
                
                context.beginPath();
                context.moveTo(461,108);
                context.lineTo(461,129);
                context.lineWidth = 3;
                context.strokeStyle = 'black';
                context.stroke();
                
                //Rect pretos
                context.save();
                context.beginPath();
                context.translate(470,115);
                context.moveTo(0,0);
                context.lineTo(9,0);
                context.lineTo(9,21);
                context.lineTo(0,21);
                context.restore();
                context.fillStyle="black";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(459,136);
                context.moveTo(0,0);
                context.lineTo(11,0);
                context.lineTo(11,17);
                context.lineTo(0,17);
                context.restore();
                context.fillStyle="black";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(459,165);
                context.moveTo(0,0);
                context.lineTo(11,0);
                context.lineTo(11,16);
                context.lineTo(0,16);
                context.restore();
                context.fillStyle="black";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(471,153);
                context.moveTo(0,0);
                context.lineTo(10,0);
                context.lineTo(10,13);
                context.lineTo(0,13);
                context.restore();
                context.fillStyle="black";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(480,136);
                context.moveTo(0,0);
                context.lineTo(11,0);
                context.lineTo(11,17);
                context.lineTo(0,17);
                context.restore();
                context.fillStyle="black";
                context.fill();
                
                context.beginPath();
                context.moveTo(490,137);
                context.lineTo(490,122);
                context.lineTo(496,137);
                context.moveTo(490,153);
                context.lineTo(490,168);
                context.lineTo(496,154);
                context.fillStyle="black";
                context.fill();
                
                //Mais triangulos/Rectangulo
                context.save();
                context.beginPath();
                context.translate(459,119);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(-15,25);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(459,144);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(-15,25);
                context.restore();
                context.fillStyle="#B6330D";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(443,144);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(15,0);
                context.restore();
                context.fillStyle="#F6CB27";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(443,144);
                context.moveTo(0,0);
                context.lineTo(0,-25);
                context.lineTo(-15,-25);
                context.lineTo(-15,0);
                context.restore();
                context.fillStyle="#F6CB27";
                context.fill();
                
            //Triangulo Amarelo N
                context.beginPath();
                context.moveTo(473,215);
                context.lineTo(347,215);
                context.lineTo(410,119);
                context.fillStyle="#FBCC26";
                context.fill();
                
                //Triangulos/Formas
                //Brancos
                context.save();
                context.beginPath();
                context.translate(410,119);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(-15,25);
                context.restore();
                context.fillStyle="#F8F0E5";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(427,192);
                context.moveTo(0,0);
                context.lineTo(15,0);
                context.lineTo(15,22);
                context.restore();
                context.fillStyle="#F8F0E5";
                context.fill();
                
                //Vermehos
                context.save();
                context.beginPath();
                context.translate(426,168);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(17,25);
                context.restore();
                context.fillStyle="#B6330D";
                context.fill();
                
                context.beginPath();
                context.moveTo(410,167);
                context.lineTo(426,167);
                context.lineTo(411,144);
                context.lineTo(393,144);
                context.moveTo(442,215);
                context.lineTo(457,192);
                context.lineTo(472,214);
                context.restore();
                context.fillStyle="#B6330D";
                context.fill();
                
                //Verdes
                context.save();
                context.beginPath();
                context.translate(410,119);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(15,25);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(427,145);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(15,25);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(443,170);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(15,25);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(427,190);
                context.moveTo(0,0);
                context.lineTo(0,25);
                context.lineTo(15,25);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(393,192);
                context.moveTo(0,0);
                context.lineTo(0,23);
                context.lineTo(17,23);
                context.lineTo(17,0);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.save();
                context.beginPath();
                context.translate(410,169);
                context.moveTo(0,0);
                context.lineTo(0,23);
                context.lineTo(17,23);
                context.lineTo(17,0);
                context.restore();
                context.fillStyle="#5A8835";
                context.fill();
                
                context.beginPath();
                context.moveTo(400,153);
                context.lineTo(389,167);
                context.lineTo(410,167);
                context.fillStyle="#5A8835";
                context.fill();
                
                context.beginPath();
                context.moveTo(362,192);
                context.lineTo(370,205);
                context.lineTo(389,175);
                context.lineTo(381,164);
                context.fillStyle="black";
                context.fill();
                
                context.beginPath();
                context.moveTo(380,164);
                context.lineTo(387,172);
                context.lineTo(398,155);
                context.lineTo(392,147);
                context.fillStyle="#603E1C";
                context.fill();
                
                context.beginPath();
                context.moveTo(392,147);
                context.lineTo(398,156);
                context.lineTo(417,127);
                context.lineTo(411,118);
                context.moveTo(380,190);
                context.lineTo(387,201);
                context.lineTo(397,185);
                context.lineTo(389,177);
                context.fillStyle="#D9D033";
                context.fill();
                
                context.beginPath();
                context.moveTo(380,190);
                context.lineTo(387,201);
                context.lineTo(379,215);
                context.lineTo(372,203);
                context.fillStyle="#D18E21";
                context.fill();
                
            //Arcos, Forma Cinzentos e Raios S
                //Forma Cinzenta S
                context.beginPath();
                context.moveTo(393,237);
                context.lineTo(393,315);
                context.lineTo(444,395);
                context.lineTo(494,350);
                context.lineTo(505,338);
                context.lineTo(409,235);
                context.fillStyle="#443F46";
                context.fill();
                
                //Raio Rosa S
                context.beginPath();
                context.moveTo(391,319);
                context.lineTo(417,313);
                context.lineTo(521,485);
                context.lineTo(469,485);
                context.fillStyle="#E7B9A1";
                context.fill();
                
                //Raio Azul S
                context.beginPath();
                context.moveTo(443,356);
                context.lineTo(522,486);
                context.lineTo(560,486);
                context.lineTo(588,458);
                context.lineTo(496,346);
                context.lineTo(485,358);
                context.lineTo(466,334);
                context.fillStyle="#5E7AC3";
                context.fill();
                
                //rectangulos dentro raios S
                context.beginPath();
                context.moveTo(367,375);
                context.lineTo(372,359);
                context.lineTo(392,359);
                context.lineTo(392,376);
                context.fillStyle="#241E1E";
                context.fill();
                
                context.beginPath();
                context.moveTo(418,316);
                context.lineTo(440,302);
                context.lineTo(460,327);
                context.lineTo(438,348);
                context.fillStyle="#D9B023";
                context.fill();
                
                context.beginPath();
                context.moveTo(454,374);
                context.lineTo(473,405);
                context.lineTo(492,390);
                context.lineTo(471,359);
                context.moveTo(494,393);
                context.lineTo(512,376);
                context.lineTo(532,401);
                context.lineTo(512,418);
                context.fillStyle="#22306C";
                context.fill();
                
                //Raio Amarelo S
                context.save();
                context.beginPath();
                context.moveTo(373,316);
                context.lineTo(416,485);
                context.lineTo(470,485);
                context.lineTo(392,319);
                context.fillStyle="#F8CF1D";
                context.globalAlpha=0.92;
                context.fill();
                context.restore();
                
                //Mais rectangulos S
                context.beginPath();
                context.moveTo(420,395);
                context.lineTo(394,395);
                context.lineTo(392,376);
                context.lineTo(415,376);
                context.moveTo(420,395);
                context.lineTo(428,429);
                context.lineTo(451,430);
                context.lineTo(444,397);
                context.moveTo(392,360);
                context.lineTo(392,340);
                context.lineTo(408,340);
                context.lineTo(413,360);
                context.fillStyle="#DDB22E";
                context.fill();
                
                //Arco Cinzento S
                context.save();
                context.translate(395,277);
                context.scale(1.1, 0.8);

                context.beginPath();
                context.arc(0, 0, 50, 0, 0.8 * Math.PI, false);
	            context.restore();
                context.lineWidth = 5;
                context.strokeStyle = '#443F46';
                context.stroke();
                
            //Forma amarela e adereços E
                context.beginPath();
                context.moveTo(510,168);
                context.lineTo(510,263);
                context.lineTo(553,276);
                context.lineTo(533,308);
                context.lineTo(631,384);
                context.lineTo(631,150);
                context.closePath;
                context.fillStyle="#CDB725";
                context.fill();
                
                context.beginPath();
                context.moveTo(510,232);
                context.lineTo(562,240);
                context.lineTo(582,268);
                context.lineTo(598,272);
                context.lineTo(565,334);
                context.lineTo(533,308);
                context.closePath;
                context.fillStyle="#CEA318";
                context.fill();
                
                context.beginPath();
                context.moveTo(578,310);
                context.lineTo(631,340);
                context.lineTo(631,384);
                context.lineTo(565,333);
                context.closePath;
                context.closePath;
                context.fillStyle="#536AAE";
                context.fill();
                
                context.beginPath();
                context.moveTo(510,179);
                context.lineTo(544,172);
                context.lineTo(544,264);
                context.lineTo(510,257);
                context.moveTo(547,274);
                context.lineTo(563,239);
                context.lineTo(596,243);
                context.lineTo(576,283);
                context.lineTo(603,293);
                context.lineTo(590,317);
                context.lineTo(566,304);
                context.lineTo(576,283);
                context.moveTo(594,356);
                context.lineTo(610,329);
                context.lineTo(630,339);
                context.lineTo(613,370);
                context.moveTo(549,321);
                context.lineTo(551,317);
                context.lineTo(580,340);
                context.lineTo(578,344);
                context.closePath;
                context.fillStyle="#1C2F69";
                context.fill();
                
                context.save();
                context.beginPath();
                context.moveTo(497,172);
                context.lineTo(566,208);
                context.lineTo(549,242);
                context.lineTo(481,207);
                context.closePath;
                context.fillStyle="#B52A0D";
                context.globalAlpha=0.95;
                context.fill();
                context.restore();
                
                context.save();
                context.translate(552,183);
                context.rotate(-0.70);
                context.scale(1,0.9);
                for( var i = 0; i < 3; i++){
                    for( var j = 0; j < 4; j++){
                        context.fillStyle = (i+j) % 2 == 0 ? "#C3B320" :"#191914";                    context.fillRect(i*15,j*15,15,15);
                    }
                }
               
                context.restore();
                
                context.beginPath();
                context.moveTo(589,243);
                context.lineTo(623,246);
                context.lineTo(623,211);
                context.lineTo(596,212);
                context.lineTo(598,215);
                context.lineTo(589,222);
                context.fillStyle="#735D08";
                context.fill();
                
                context.beginPath();
                context.moveTo(605,265);
                context.lineTo(618,269);
                context.lineTo(627,251);
                context.lineTo(614,247);
                context.fillStyle="#191914";
                context.fill();
                
            //Adereços e forma preta E
                context.beginPath();
                context.moveTo(553,276);
                context.lineTo(554,276);
                context.lineTo(510,262);
                context.lineTo(510,257);
                context.lineTo(510,223);
                context.lineTo(473,227);
                context.lineTo(472,206);
                context.lineTo(448,206);
                context.lineTo(448,230);
                context.lineTo(406,236);
                context.lineTo(405,258);
                context.lineTo(434,295);
                context.lineTo(435,263);
                context.lineTo(462,292);
                context.lineTo(466,288);
                context.lineTo(472,292);
                context.lineTo(492,272);
                context.lineTo(534,308); 
                context.closePath();
                context.fillStyle="black";
                context.fill();
                
                //1º set (maior)
                context.save();
                context.translate(436,256);
                context.rotate(-0.8);
                
                context.fillStyle="#D6B223";
                context.fillRect(0,0,20,20);
                context.fillRect(0,80,22,5);
                
                context.fillStyle="#263471";
                context.fillRect(0,20,22,22);
                context.fillRect(-1,88,23,22);
                context.fillRect(0,115,22,29);
                                
                context.fillStyle="#4E2916";
                context.fillRect(0,50,22,30);
                context.fillRect(28,50,10,25);
                context.restore();
                
                context.beginPath();
                context.moveTo(480,255);
                context.lineTo(487,239);
                context.lineTo(503,244);
                context.lineTo(497,261);
                context.fillStyle="#263471";
                context.fill();
                
                //2º set (mais pequeno)
                context.save();
                context.translate(435,292);
                context.rotate(-0.75);
                
                context.fillStyle="#D6B223";
                context.fillRect(0,4,20,16);
                context.fillRect(0,43,20,26);
                
                context.fillStyle="#263471";
                context.fillRect(0,25,20,18);
                context.restore();    
                
            //forma azul W
                context.beginPath();
                context.moveTo(273,177);
                context.lineTo(273,261);
                context.lineTo(61,344);
                context.lineTo(61,56);
                context.lineTo(273,177);
                context.closePath();
                context.fillStyle="#9BABC4";
                context.fill();
                
                //forma preta dentro azul W
                context.beginPath();
                context.moveTo(126,93);
                context.lineTo(126,201);
                context.lineTo(168,280);
                context.lineTo(146,310);
                context.lineTo(273,261);
                context.lineTo(273,177);
                context.closePath();
                context.fillStyle="#2D2B2A";
                context.fill();
                
                //losngos dentro forma azul
                context.beginPath();
                context.moveTo(82,136);
                context.lineTo(144,105);
                context.moveTo(61,174);
                context.lineTo(161,115);
                context.moveTo(61,195);
                context.lineTo(174,123);
                context.moveTo(61,220);
                context.lineTo(126,178);
                context.moveTo(61,246);
                context.lineTo(126,205);
                context.moveTo(61,267);
                context.lineTo(126,223);
                context.moveTo(61,292);
                context.lineTo(126,245);
                context.moveTo(82,162);
                context.lineTo(82,276);
                context.moveTo(103,81);
                context.lineTo(103,260);
                context.moveTo(82,135);
                context.lineTo(82,70);
                context.lineTo(103,80);
                context.lineTo(103,125);
                context.closePath();
                context.lineWidth=2;
                context.strokeStyle="#2D2B2A";
                context.stroke();
                
                context.beginPath();
                context.moveTo(61,173);
                context.lineTo(58,174);
                context.lineTo(58,198);
                context.lineTo(61,196);
                context.moveTo(61,218);
                context.lineTo(58,221);
                context.lineTo(58,249);
                context.lineTo(61,247);
                context.moveTo(61,265);
                context.lineTo(58,267);
                context.lineTo(58,295);
                context.lineTo(61,293);
                context.closePath();
                context.fillStyle="#2D2B2A";
                context.fill();
                
                //quadradinhos verdes
                context.fillStyle="#7B8C32";
                context.fillRect(61,223,14,13);
                context.fillRect(83,238,19,16);
                context.fillRect(61,266,16,11);
                
                //losangos azuis
                context.beginPath();
                context.moveTo(130,99);
                context.lineTo(140,106);
                context.lineTo(130,111);
                context.moveTo(130,114);
                context.lineTo(145,106);
                context.lineTo(145,122);
                context.lineTo(130,131);
                context.moveTo(130,134);
                context.lineTo(145,125);
                context.lineTo(145,141);
                context.lineTo(130,151);
                context.moveTo(130,154);
                context.lineTo(145,144);
                context.lineTo(145,162);
                context.lineTo(130,171);
                context.moveTo(130,176);
                context.lineTo(145,166);
                context.lineTo(145,183);
                context.lineTo(130,192);
                context.moveTo(130,203);
                context.lineTo(130,198);
                context.lineTo(145,187);
                context.lineTo(145,203);
                context.moveTo(150,107);
                context.lineTo(150,119);
                context.lineTo(161,113);
                context.lineTo(161,130);
                context.lineTo(174,121);
                context.lineTo(174,137);
                context.lineTo(188,128);
                context.lineTo(150,107);
                context.moveTo(150,122);
                context.lineTo(159,116);
                context.lineTo(159,131);
                context.lineTo(150,138);
                context.moveTo(150,141);
                context.lineTo(159,134);
                context.lineTo(159,147);
                context.lineTo(150,153);
                context.moveTo(162,133);
                context.lineTo(172,125);
                context.lineTo(172,140);
                context.lineTo(162,145);
                context.moveTo(150,163);
                context.lineTo(167,152);
                context.lineTo(167,168);
                context.lineTo(150,178);
                context.moveTo(150,184);
                context.lineTo(167,173);
                context.lineTo(167,188);
                context.lineTo(150,199);
                context.moveTo(153,203);
                context.lineTo(168,194);
                context.lineTo(168,203);
                context.moveTo(174,147);
                context.lineTo(187,138);
                context.lineTo(187,154);
                context.lineTo(174,163);
                context.moveTo(174,167);
                context.lineTo(187,159);
                context.lineTo(187,174);
                context.lineTo(174,183);
                context.moveTo(174,188);
                context.lineTo(187,179);
                context.lineTo(187,193);
                context.lineTo(174,202);
                context.moveTo(189,131);
                context.lineTo(189,141);
                context.lineTo(196,136);
                context.moveTo(197,137);
                context.lineTo(197,151);
                context.lineTo(209,143);
                context.moveTo(197,154);
                context.lineTo(197,166);
                context.lineTo(214,154);
                context.lineTo(214,143);
                context.moveTo(197,172);
                context.lineTo(197,186);
                context.lineTo(207,179);
                context.lineTo(207,165);
                context.moveTo(207,203);
                context.lineTo(207,190);
                context.lineTo(197,196);
                context.lineTo(197,203);
                context.moveTo(214,171);
                context.lineTo(225,164);
                context.lineTo(225,177);
                context.lineTo(214,184);
                context.moveTo(214,199);
                context.lineTo(225,190);
                context.lineTo(225,203);
                context.lineTo(214,203);
                context.moveTo(237,182);
                context.lineTo(244,176);
                context.lineTo(244,186);
                context.lineTo(237,193);
                context.moveTo(254,191);
                context.lineTo(263,181);
                context.lineTo(263,194);
                context.lineTo(254,203);
                context.closePath();
                context.fillStyle="#9BABC4";
                context.fill();
                
                
            //rect amarelo e adereços SW
                context.fillStyle="#DECE31";
                context.fillRect(113,203,252,76);
                
                context.beginPath();
                context.moveTo(113,211);
                context.lineTo(141,207);
                context.lineTo(167,249);
                context.lineTo(150,279);
                context.lineTo(113,279);
                context.lineTo(113,211);
                context.closePath();
                context.fillStyle="#7A8E2D";
                context.fill();
                
                context.beginPath();
                context.moveTo(279,279);
                context.lineTo(310,279);
                context.lineTo(328,249);
                context.lineTo(328,203);
                context.lineTo(279,279);
                context.fill();
                context.fillStyle="#BEC969";
                context.fill();
                
                context.beginPath();
                context.moveTo(310,279);
                context.lineTo(336,279);
                context.lineTo(352,249);
                context.lineTo(328,249);
                context.lineTo(310,279);
                context.fill();
                context.fillStyle="#5E8B38";
                context.fill();
                
                context.beginPath();
                context.moveTo(328,249);
                context.lineTo(358,249);
                context.lineTo(358,203);
                context.lineTo(328,249);
                context.fill();
                context.fillStyle="#BE3719";
                context.fill();
                
                context.beginPath();
                context.moveTo(328,249);
                context.lineTo(328,243);
                context.lineTo(355,203);
                context.lineTo(359,203);
                context.lineTo(359,205);
                context.lineTo(328,249);
                context.fill();
                context.fillStyle="#D25D20";
                context.fill();
                
                context.beginPath();
                context.moveTo(328,243);
                context.lineTo(355,203);
                context.lineTo(328,203);
                context.lineTo(328,243);
                context.fill();
                context.fillStyle="#E8836F";
                context.fill();
                
                context.beginPath();
                context.moveTo(290,203);
                context.lineTo(315,203);
                context.lineTo(290,238);
                context.lineTo(290,203);
                context.fill();
                context.fillStyle="#BE3719";
                context.fill();
                
                context.beginPath();
                context.moveTo(364,226);
                context.lineTo(388,279);
                context.lineTo(364,279);
                context.fill();
                context.fillStyle="#38487C";
                context.fill();
                                
            //Rectangulos castanhos SW
                context.save();
                context.translate(115,495);
                context.rotate(-0.95);
                context.fillStyle="#553117";
                context.fillRect(0,0,261,80);
                
                context.fillStyle="#BD3819";
                context.fillRect(260,12,17,55);
                context.restore();
                
                context.save();
                context.translate(0,440);
                context.rotate(-0.58);
                context.fillStyle="#553117";
                context.fillRect(-50,0,300,110);
                
                context.fillStyle="#DDB329";
                context.fillRect(250,15,65,70);
                context.restore();
                                            
             //forma verde SW
                context.beginPath();
                context.moveTo(9,380);
                context.lineTo(9,360);
                context.lineTo(98,330);
                context.lineTo(101,344);
                context.lineTo(131,328);
                context.lineTo(136,352);
                context.lineTo(30,422);          
                context.lineTo(13,377);
                context.closePath();
                context.fillStyle="#798D2E";
                context.fill();
                
            //figura preta S
                context.beginPath();
                context.moveTo(346,299);
                context.lineTo(333,326);
                context.lineTo(232,466);
                context.lineTo(389,466);
                context.lineTo(379,429);
                context.lineTo(392,429);
                context.lineTo(392,397);          
                context.lineTo(362,397);
                context.lineTo(367,376);
                context.lineTo(362,359);
                context.lineTo(372,359);
                context.lineTo(378,339);
                context.lineTo(358,339);
                context.lineTo(346,299);
                context.closePath();
                context.fillStyle="#241E1E";
                context.fill();
                
            
                
             //'borders'
                context.fillStyle="#F8F0E5";
                context.fillRect(0,430,10,55);
                context.fillRect(0,485,220,20);
                
                context.fillStyle="#B3A091";
                context.fillRect(5,6,631,5);
                context.fillRect(5,485,631,5);
			}
