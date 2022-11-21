/*
 * nephilim.online.creator.back
 *
 * Copyright (c) 2022 by rorshach-corp
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

export interface Degree {
  name: string,
  description: string,
  type: DegreeTypeEnum,
  affinity: KaElementEnum,
}

export enum DegreeTypeEnum {
  ARCANA_QUEST = 'ARCANA_QUEST',
  ESOTERIC_QUEST = 'ESOTERIC_QUEST',
  SIMULACRUM = 'SIMULACRUM',
  ESOTERIC_KNOWLEDGE = 'ESOTERIC_KNOWLEDGE',
  OCCULT_ART = 'OCCULT_ART',
}

export enum KaElementEnum {
  FIRE = 'FIRE', EARTH = 'EARTH', WATER = 'WATER', MOON = 'MOON', AIR = 'AIR'
}
