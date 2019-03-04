package typings
package zeromqLib.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTypes extends js.Object {
  var dealer: scala.Double
  var pair: scala.Double
  var pub: scala.Double
  var pull: scala.Double
  var push: scala.Double
  var rep: scala.Double
  var req: scala.Double
  var router: scala.Double
  var stream: scala.Double
  var sub: scala.Double
  var xpub: scala.Double
  var xrep: scala.Double
  var xreq: scala.Double
  var xsub: scala.Double
}

object SocketTypes {
  @scala.inline
  def apply(
    dealer: scala.Double,
    pair: scala.Double,
    pub: scala.Double,
    pull: scala.Double,
    push: scala.Double,
    rep: scala.Double,
    req: scala.Double,
    router: scala.Double,
    stream: scala.Double,
    sub: scala.Double,
    xpub: scala.Double,
    xrep: scala.Double,
    xreq: scala.Double,
    xsub: scala.Double
  ): SocketTypes = {
    val __obj = js.Dynamic.literal(dealer = dealer, pair = pair, pub = pub, pull = pull, push = push, rep = rep, req = req, router = router, stream = stream, sub = sub, xpub = xpub, xrep = xrep, xreq = xreq, xsub = xsub)
  
    __obj.asInstanceOf[SocketTypes]
  }
}

