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

trait Error extends js.Object {
  var Error: Instantiable3[
    /* message */ String, 
    js.UndefOr[/* code */ String], 
    js.UndefOr[/* status */ Double], 
    AppError
  ]
  var ExpiredAuthError: Instantiable0[typings.zapierPlatformCore.mod.ExpiredAuthError]
  var HaltedError: Instantiable0[typings.zapierPlatformCore.mod.HaltedError]
  var RefreshAuthError: Instantiable0[typings.zapierPlatformCore.mod.RefreshAuthError]
}

object Error {
  @scala.inline
  def apply(
    Error: Instantiable3[
      /* message */ String, 
      js.UndefOr[/* code */ String], 
      js.UndefOr[/* status */ Double], 
      AppError
    ],
    ExpiredAuthError: Instantiable0[ExpiredAuthError],
    HaltedError: Instantiable0[HaltedError],
    RefreshAuthError: Instantiable0[RefreshAuthError]
  ): Error = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

