/*
 * Copyright (c) 2020, <GiacomoSorbi> All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE. The views and conclusions contained in the
 * software and documentation are those of the authors and should not be
 * interpreted as representing official policies, either expressed or implied,
 * of the FreeBSD Project.
 */

package _02_IntroToQueues;

import java.util.ArrayDeque;

/*
 * Complete the calculateWaitTime() method here!
 * Instructions are in the BaseBallTicketsTest class.
 */

public class _02_BaseballTickets {

	public static int calculateWaitTime(ArrayDeque<Integer> ticketsQueue, int position) {
		int rad = 0;
		int cool = 0;
		int cooler = 0;
		int counter = 0;
		int position2 = position;

		if (position == 0) {
			cooler = ticketsQueue.getFirst();
			
			
		} else {
			
			for (int i = 0; i < position; i++) {
				cool = ticketsQueue.remove();
				ticketsQueue.add(cool);
			}
			cooler = ticketsQueue.getFirst();
			
			
			for (int i = 0; i < ticketsQueue.size() - position; i++) {
				cool = ticketsQueue.remove();
				ticketsQueue.add(cool);
			}
			
		}
		
		while(cooler > 0) {
			
			
			if(position2 <= 0) {
				position2 = ticketsQueue.size();
				cooler -=1;
			}
				
				rad = ticketsQueue.remove();
				counter += 1;
				rad -= 1;
				position2 -=1;
				if(rad != 0) {
					ticketsQueue.add(rad);
				}
				else {
					position2 --;
				}
				
				
				
				
			
				
				
				
		}
		
		
				return counter;
		
		
	}
	}


