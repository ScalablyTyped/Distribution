package typings.zeromq.mod

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
    val __obj = js.Dynamic.literal(dealer = dealer.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rep = rep.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any], xrep = xrep.asInstanceOf[js.Any], xreq = xreq.asInstanceOf[js.Any], xsub = xsub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTypes]
  }
}

