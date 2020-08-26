package typings.zapierPlatformCore.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.zapierPlatformCore.mod.AppError
import typings.zapierPlatformCore.mod.ExpiredAuthError
import typings.zapierPlatformCore.mod.HaltedError
import typings.zapierPlatformCore.mod.RefreshAuthError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var Error: Instantiable3[
    /* message */ String, 
    /* code */ js.UndefOr[String], 
    /* status */ js.UndefOr[Double], 
    AppError
  ] = js.native
  var ExpiredAuthError: Instantiable0[typings.zapierPlatformCore.mod.ExpiredAuthError] = js.native
  var HaltedError: Instantiable0[typings.zapierPlatformCore.mod.HaltedError] = js.native
  var RefreshAuthError: Instantiable0[typings.zapierPlatformCore.mod.RefreshAuthError] = js.native
}

object Error {
  @scala.inline
  def apply(
    Error: Instantiable3[
      /* message */ String, 
      /* code */ js.UndefOr[String], 
      /* status */ js.UndefOr[Double], 
      AppError
    ],
    ExpiredAuthError: Instantiable0[ExpiredAuthError],
    HaltedError: Instantiable0[HaltedError],
    RefreshAuthError: Instantiable0[RefreshAuthError]
  ): Error = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(
      value: Instantiable3[
          /* message */ String, 
          /* code */ js.UndefOr[String], 
          /* status */ js.UndefOr[Double], 
          AppError
        ]
    ): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiredAuthError(value: Instantiable0[ExpiredAuthError]): Self = this.set("ExpiredAuthError", value.asInstanceOf[js.Any])
    @scala.inline
    def setHaltedError(value: Instantiable0[HaltedError]): Self = this.set("HaltedError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshAuthError(value: Instantiable0[RefreshAuthError]): Self = this.set("RefreshAuthError", value.asInstanceOf[js.Any])
  }
  
}

