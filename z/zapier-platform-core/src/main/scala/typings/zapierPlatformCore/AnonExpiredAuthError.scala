package typings.zapierPlatformCore

import org.scalablytyped.runtime.Instantiable0
import typings.zapierPlatformCore.mod.ExpiredAuthError
import typings.zapierPlatformCore.mod.HaltedError
import typings.zapierPlatformCore.mod.RefreshAuthError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiredAuthError extends js.Object {
  var ExpiredAuthError: Instantiable0[typings.zapierPlatformCore.mod.ExpiredAuthError]
  var HaltedError: Instantiable0[typings.zapierPlatformCore.mod.HaltedError]
  var RefreshAuthError: Instantiable0[typings.zapierPlatformCore.mod.RefreshAuthError]
}

object AnonExpiredAuthError {
  @scala.inline
  def apply(
    ExpiredAuthError: Instantiable0[ExpiredAuthError],
    HaltedError: Instantiable0[HaltedError],
    RefreshAuthError: Instantiable0[RefreshAuthError]
  ): AnonExpiredAuthError = {
    val __obj = js.Dynamic.literal(ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpiredAuthError]
  }
}

