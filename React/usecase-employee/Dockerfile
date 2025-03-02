# Use Node.js as the base image
FROM node:20-alpine

# Set working directory inside container
WORKDIR /app

# Copy package.json and package-lock.json
COPY package.json package-lock.json ./

# Install dependencies with legacy-peer-deps to bypass conflicts
RUN npm install --legacy-peer-deps

# Copy the entire project
COPY . .

# Build the React project
RUN npm run build

# Serve the build with a lightweight server
RUN npm install -g serve
CMD ["serve", "-s", "build", "-l", "3000", "--single"]


# Expose the frontend port
EXPOSE 3000
