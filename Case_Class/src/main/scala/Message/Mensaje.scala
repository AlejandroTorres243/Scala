package Message

import Class.{Email, Notification, Sms, VoiceRecording}

class Mensaje() {
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, body) =>
        s"You got an email from $sender with title: $title and with body of: $body"
      case Sms(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case Sms(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }
}
