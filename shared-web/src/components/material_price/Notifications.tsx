import * as ReactDOM from "react-dom";
import {
  Notification,
  NotificationGroup,
} from "@progress/kendo-react-notification";
import { Fade } from "@progress/kendo-react-animation";
import React from "react";
import { createRoot } from "react-dom/client";

type MessageType = "success" | "error" | "info" | "warning";

interface NotifyProps {
  message: string;
  type: MessageType;
  verticalPosition?: "top" | "bottom";
  horizontalPosition?: "left" | "right" | "center";
}

const NotificationSnackbar: React.FC<NotifyProps> = ({ message, type }) => {
  return (
    <NotificationGroup
      style={{
        right: 0,
        top: 0,
        alignItems: "flex-start",
        flexWrap: "wrap-reverse",
      }}
    >
      <Fade>
        <Notification
          type={{
            style: type,
            icon: true,
          }}
          closable={true}
          onClose={() => {
            const notificationElement = document.getElementById("notification");
            if (notificationElement) {
              document.body.removeChild(notificationElement);
            }
          }}
        >
          <span>{message}</span>
        </Notification>
      </Fade>
    </NotificationGroup>
  );
};

export const showNotification = ({ message, type }: NotifyProps) => {
  const container = document.createElement("div");
  container.id = "notification";
  document.body.appendChild(container);
  const root = createRoot(container);
  root.render(<NotificationSnackbar message={message} type={type} />);
  setTimeout(() => {
    const notificationElement = document.getElementById("notification");
    if (notificationElement) {
      document.body.removeChild(notificationElement);
    }
  }, 3000);
};
