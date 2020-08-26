package typings.zchatBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jwtfn extends js.Object {
  var jwt_fn: js.UndefOr[js.Function1[/* callback */ js.Function1[/* jwt */ String, Unit], Unit]] = js.native
}

object Jwtfn {
  @scala.inline
  def apply(): Jwtfn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwtfn]
  }
  @scala.inline
  implicit class JwtfnOps[Self <: Jwtfn] (val x: Self) extends AnyVal {
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
    def setJwt_fn(value: /* callback */ js.Function1[/* jwt */ String, Unit] => Unit): Self = this.set("jwt_fn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteJwt_fn: Self = this.set("jwt_fn", js.undefined)
  }
  
}

