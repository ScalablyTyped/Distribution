package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AbstractHandshake extends js.Object {
  var authType: java.lang.String
  var authVersion: java.lang.String
  var deploymentId: java.lang.String
  var sandboxId: java.lang.String
  def getHandshakeFields(client: Client): HandshakeFields
}

