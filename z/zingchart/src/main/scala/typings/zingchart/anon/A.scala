package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A extends js.Object {
  @JSName("`%A`")
  var GraveaccentPercentsignAGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%D`")
  var GraveaccentPercentsignDGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%G`")
  var GraveaccentPercentsignGGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%H`")
  var GraveaccentPercentsignHGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%M`")
  var GraveaccentPercentsignMGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%Y`")
  var GraveaccentPercentsignYGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%a`")
  var GraveaccentPercentsignaGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%d`")
  var GraveaccentPercentsigndGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%dd`")
  var GraveaccentPercentsignddGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%g`")
  var GraveaccentPercentsigngGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%h`")
  var GraveaccentPercentsignhGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%i`")
  var GraveaccentPercentsigniGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%m`")
  var GraveaccentPercentsignmGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%mm`")
  var GraveaccentPercentsignmmGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%q`")
  var GraveaccentPercentsignqGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%s`")
  var GraveaccentPercentsignsGraveaccent: js.UndefOr[js.Any] = js.native
  @JSName("`%y`")
  var GraveaccentPercentsignyGraveaccent: js.UndefOr[js.Any] = js.native
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
  var all: js.UndefOr[String] = js.native
  var guide: js.UndefOr[LinewidthVisible] = js.native
  var item: js.UndefOr[Borderradiustopright] = js.native
}

object A {
  @scala.inline
  def apply(): A = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A]
  }
  @scala.inline
  implicit class AOps[Self <: A] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGraveaccentPercentsignAGraveaccent(value: js.Any): Self = this.set("`%A`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignAGraveaccent: Self = this.set("`%A`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignDGraveaccent(value: js.Any): Self = this.set("`%D`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignDGraveaccent: Self = this.set("`%D`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignGGraveaccent(value: js.Any): Self = this.set("`%G`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignGGraveaccent: Self = this.set("`%G`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignHGraveaccent(value: js.Any): Self = this.set("`%H`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignHGraveaccent: Self = this.set("`%H`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignMGraveaccent(value: js.Any): Self = this.set("`%M`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignMGraveaccent: Self = this.set("`%M`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignYGraveaccent(value: js.Any): Self = this.set("`%Y`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignYGraveaccent: Self = this.set("`%Y`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignddGraveaccent(value: js.Any): Self = this.set("`%dd`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignddGraveaccent: Self = this.set("`%dd`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsigniGraveaccent(value: js.Any): Self = this.set("`%i`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsigniGraveaccent: Self = this.set("`%i`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignmmGraveaccent(value: js.Any): Self = this.set("`%mm`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignmmGraveaccent: Self = this.set("`%mm`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignqGraveaccent(value: js.Any): Self = this.set("`%q`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignqGraveaccent: Self = this.set("`%q`", js.undefined)
    @scala.inline
    def setGraveaccentPercentsignsGraveaccent(value: js.Any): Self = this.set("`%s`", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraveaccentPercentsignsGraveaccent: Self = this.set("`%s`", js.undefined)
    @scala.inline
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setGuide(value: LinewidthVisible): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    @scala.inline
    def setItem(value: Borderradiustopright): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

