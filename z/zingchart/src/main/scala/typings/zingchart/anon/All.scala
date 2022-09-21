package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  /**
    * To format your date values. Use this attribute with the `type` value (set to `true`). Token Description `%A` Displays the ante or
    * post meridiem time in upper case letters: AM or PM. `%a` Displays the ante or post meridiem time in lower case letters: am or pm.
    * `%D` Displays the day of the week in abbreviated form: Sun, Mon, Tue, Wed, Thu, Fri. `%d` Displays the day's date without a leadin
    * g 0 if the date is single digit. `%dd` Displays the day's date with a leading 0 if the date is single digit. `%G` Displays the hou
    * r in 24-hour format without a leading 0. `%g` Displays the hour in 12-hour format without a leading 0. `%H` Displays the hour in 2
    * 4-hour format with a leading 0 if the hour is single digit. `%h` Displays the hour in 12-hour format with a leading 0 if the hour
    * is single digit. `%i` Displays the minutes. `%M` Displays the month in abbreviated form: Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, S
    * ep, Oct, Nov and Dec. `%m` Displays the month numerically without a leading 0 if the date is single digit. `%mm` Display the month
    *  numerically with a leading 0 if the month is single digit. `%q` Displays the milliseconds. `%s` Displays the seconds. `%Y` Displa
    * ys the year in 4-digit format. `%y` Displays the year in 2-digit format.
    */
  var all: js.UndefOr[String] = js.undefined
  
  /**
    * The text of the scale label, can use tokens for day, hour, minute, year etc to add in such information, ONLY if "type"="date" has
    * been specified in this transform object. If values for both "text" and "all" have been specified, the value in "text" will be used
    * . 'Month of %M' | '%d' | ...
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * To convert Unix timestamps into dates. Use this attribute with the all attribute. 'date'
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * To set the time-series scale to linear (uniform) or non-linear. true | false | 1 | 0
    */
  var uniform: js.UndefOr[Boolean] = js.undefined
}
object All {
  
  inline def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniform(value: Boolean): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
    
    inline def setUniformUndefined: Self = StObject.set(x, "uniform", js.undefined)
  }
}
