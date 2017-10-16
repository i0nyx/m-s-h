/*!
 *
 *  Web Starter Kit
 *  Copyright 2015 Google Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 *
 */
!function(){"use strict";function e(){var e=$(window).width();e<992?t||n():o()}function n(){var e=$(".js-mobile-menu"),n=$(".js-header-menu");e.html(n.clone()),t=!0}function o(){var e=$(".js-mobile-menu");e.html(""),$("body").removeClass("menu-open"),t=!1}function i(){$("body").toggleClass("menu-open")}var s=$(".js-top-slider");s.carousel({interval:5e3}),$(".js-top-slider").hammer().on("swiperight",function(){s.carousel("prev")}),$(".js-top-slider").hammer().on("swipeleft",function(){s.carousel("next")});var t=!1;e(),$(window).on("resize",e),$(".js-mobile-menu-toggle").on("click",i),$(".js-mobile-menu").on("click",".header-menu__icon",function(){$(this).parent().parent().toggleClass("show-menu")})}();
//# sourceMappingURL=main.js.map
