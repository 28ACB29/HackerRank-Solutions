
def rot13(secret_messages)
  # your code here
    return secret_messages.collect{|secret_message| secret_message.tr('A-Za-z', 'N-ZA-Mn-za-m')}
end

