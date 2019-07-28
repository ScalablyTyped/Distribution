package typings.zeromq.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTypes extends js.Object {
  var dealer: Double
  var pair: Double
  var pub: Double
  var pull: Double
  var push: Double
  var rep: Double
  var req: Double
  var router: Double
  var stream: Double
  var sub: Double
  var xpub: Double
  var xrep: Double
  var xreq: Double
  var xsub: Double
}

object SocketTypes {
  @scala.inline
  def apply(
    dealer: Double,
    pair: Double,
    pub: Double,
    pull: Double,
    push: Double,
    rep: Double,
    req: Double,
    router: Double,
    stream: Double,
    sub: Double,
    xpub: Double,
    xrep: Double,
    xreq: Double,
    xsub: Double
  ): SocketTypes = {
    val __obj = js.Dynamic.literal(dealer = dealer, pair = pair, pub = pub, pull = pull, push = push, rep = rep, req = req, router = router, stream = stream, sub = sub, xpub = xpub, xrep = xrep, xreq = xreq, xsub = xsub)
  
    __obj.asInstanceOf[SocketTypes]
  }
}

