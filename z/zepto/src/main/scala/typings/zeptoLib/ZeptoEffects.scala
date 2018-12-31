package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoEffects extends js.Object {
  /**
  	* (default false in browsers that support CSS transitions): set to true to disable all animate() transitions.
  	**/
  var off: scala.Boolean
  /**
  	* An object with duration settings for animations.
  	* Change existing values or add new properties to affect animations that use a string for setting duration.
  	**/
  var speeds: ZeptoEffectsSpeeds
}

